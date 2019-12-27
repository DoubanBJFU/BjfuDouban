package dao;

import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import jdbc.utils.JDBCUtils;



public abstract class BaseDAO {

	/*
	 * 	���ͷ���������һ������ѯ�Ķ���
	 * */
	public <T> T getInstance(Connection con,Class clazz,String sql,Object...args) 
			throws SQLException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		//Ԥ���룬������������
		PreparedStatement ps = null;
		//������ݼ���Ԫ���ݼ�
		ResultSet res = null;
		try {
			ps = con.prepareStatement(sql);
			for(int i=0;i<args.length;i++)
				ps.setObject(i+1, args[i]);
			
			res = ps.executeQuery();
			ResultSetMetaData rsmd = res.getMetaData();
			int col = rsmd.getColumnCount();
			
			if(res.next()) {
				//�õ�һ���ն���
				T t = (T)clazz.newInstance();
				for(int i=0;i<col;i++) {
					//��ý���������ݺ�Ԫ����
					Object value;
					value = res.getObject(i+1);
					
					//else value = res.getTimestamp(4);
					String colLabel = rsmd.getColumnLabel(i+1);
				
					//���÷������ն�������������
					Field field = clazz.getDeclaredField(colLabel);
				//	System.out.println(value+colLabel+field.getType());	
					field.setAccessible(true);
					field.set(t,value);
				}
				
				System.out.println("��ѯ�ɹ�");
				return t;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JDBCUtils.closeResource(null, ps, res);
		}
		
		return null;
	}

	public <T> ArrayList<T> getForList(Connection con,Class clazz,String sql,Object...args) 
			throws SQLException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException{
		PreparedStatement ps = null;
		ResultSet res = null;
		try {
			ps = con.prepareStatement(sql);
			for(int i=0;i<args.length;i++)
				ps.setObject(i+1,args[i]);
			
			res = ps.executeQuery();
			ResultSetMetaData rsmd = res.getMetaData();
			int col = rsmd.getColumnCount();
			
			ArrayList<T>list = new ArrayList<T>();//Ҫ���ص�list
			while(res.next()) {
				T t=(T) clazz.newInstance();
				for(int i=0;i<col;i++) {
					Object value = res.getObject(i+1);
					String colLabel = rsmd.getColumnLabel(i+1);

					Field field = clazz.getDeclaredField(colLabel);
					field.setAccessible(true);
					field.set(t, value);
				}
				list.add(t);
			}
			
			System.out.println("��ѯ�ɹ�");
			return list;
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JDBCUtils.closeResource(null, ps, res);
		}
		return null;
	}
	
	public <E> E getValue(Connection con,Class clazz,String sql,Object...args) 
			throws SQLException {
		PreparedStatement ps = null;
		ResultSet res = null;
		try {
			ps = con.prepareStatement(sql);
			for(int i=0;i<args.length;i++)
				ps.setObject(i+1, args[i]);
			
			res = ps.executeQuery();
			System.out.println("��ѯ�ɹ�");
			if(res.next()) {
				return (E)res.getObject(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JDBCUtils.closeResource(null, ps, res);
		}
		return null;
	}

	public void update(Connection con,String sql,Object...args) 
			throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			for(int i=0;i<args.length;i++) {
				System.out.println(args[i]);
				ps.setObject(i+1, args[i]);
			}

			System.out.println("�޸ĳɹ�");
			ps.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JDBCUtils.closeResource(null, ps);
		}
	}
}

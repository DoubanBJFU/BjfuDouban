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
	 * 	泛型方法：返回一个所查询的对象
	 * */
	public <T> T getInstance(Connection con,Class clazz,String sql,Object...args) 
			throws SQLException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		//预编译，并将参数填入
		PreparedStatement ps = null;
		//获得数据集，元数据集
		ResultSet res = null;
		try {
			ps = con.prepareStatement(sql);
			for(int i=0;i<args.length;i++)
				ps.setObject(i+1, args[i]);
			
			res = ps.executeQuery();
			ResultSetMetaData rsmd = res.getMetaData();
			int col = rsmd.getColumnCount();
			
			if(res.next()) {
				//得到一个空对象
				T t = (T)clazz.newInstance();
				for(int i=0;i<col;i++) {
					//获得结果集的数据和元数据
					Object value;
					value = res.getObject(i+1);
					
					//else value = res.getTimestamp(4);
					String colLabel = rsmd.getColumnLabel(i+1);
				
					//利用反射往空对象里填入数据
					Field field = clazz.getDeclaredField(colLabel);
				//	System.out.println(value+colLabel+field.getType());	
					field.setAccessible(true);
					field.set(t,value);
				}
				
				System.out.println("查询成功");
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
			
			ArrayList<T>list = new ArrayList<T>();//要返回的list
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
			
			System.out.println("查询成功");
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
			System.out.println("查询成功");
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

			System.out.println("修改成功");
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

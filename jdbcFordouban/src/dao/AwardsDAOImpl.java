package dao;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import	dao.BaseDAO;
import jdbc.utils.JDBCUtils;
import bean.Awards;

public class AwardsDAOImpl extends BaseDAO implements AwardsDAO{
	@Test
	public void test1() {
		Connection con = null;
		AwardsDAOImpl ob = new AwardsDAOImpl();
		try {
			con = JDBCUtils.getConnection();
			
			Awards awards1 = new Awards(0,"zsb",2);
			ob.insert(con, awards1);
			
			Awards awards = ob.getById(con, 2);
			System.out.println(awards);
			
			ArrayList<Awards> list = ob.getAll(con);
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));
			
			System.out.println(ob.getCount(con));
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			JDBCUtils.closeResource(con, null);
		}
	}
	
	@Override
	public void insert(Connection con, Awards awards) {
		// TODO Auto-generated method stub
		String sql = "insert into Awards(Award_name,M_id) values(?,?)";
		try {
			update(con,sql,awards.getAward_name(),awards.getM_id());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Awards getById(Connection con, int id) {
		try {
			String sql = "select * from Awards where Award_id = ?";
			Awards awards = getInstance(con, Awards.class, sql, id);
			return awards;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Awards> getAll(Connection con) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from Awards";
			ArrayList<Awards> list = getForList(con, Awards.class, sql);
			return list;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getCount(Connection con) {
		// TODO Auto-generated method stub
		try {
			String sql = "select count(*) from Awards";
			return getValue(con, Awards.class, sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}

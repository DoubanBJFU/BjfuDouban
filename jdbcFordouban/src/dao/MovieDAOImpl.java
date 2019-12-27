package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import bean.Country;
import bean.Movies;
import jdbc.utils.JDBCUtils;


public class MovieDAOImpl extends BaseDAO implements MovieDAO{

	@Test
	public void Test() {
		Connection con = null;
		try {
			con = JDBCUtils.getConnection();
			
			java.sql.Timestamp date = new java.sql.Timestamp(new Date(0).getTime());
			
			Movies movies = new Movies(0,"¸´³ðÕßÁªÃË","Ó¢Óï",date,"120mins","¸´Áª");
			insert(con, movies);
			System.out.println(getById(con, 1));
			
			ArrayList<Movies> list = getAll(con);
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtils.closeResource(con, null);
		}
	}
	
	@Override
	public void insert(Connection con, Movies movies) {
		try {
			String sql = "insert into Movies values(?,?,?,?,?)";
			update(con, sql, movies.getM_name(),movies.getM_language(),
					movies.getM_date(),movies.getM_length(),movies.getM_othername());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Connection con, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateById(Connection con, int id, Movies movies) {
		// TODO Auto-generated method stub
		try {
			String sql = "update Movies set M_name = ?,M_language = ?,M_date = ?,M_length = ?,M_othername = ? where M_id = ?";
			update(con, sql, movies.getM_name(),movies.getM_language(),
						movies.getM_date(),movies.getM_length(),movies.getM_othername(),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Movies getById(Connection con, int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from Movies where M_id = ?";
			return getInstance(con, Movies.class, sql, id);
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
	public ArrayList<Movies> getAll(Connection con) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from Movies";
			return getForList(con, Movies.class, sql);
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
			String sql = "select count(*) from Movies";
			return getValue(con, Movies.class, sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
}

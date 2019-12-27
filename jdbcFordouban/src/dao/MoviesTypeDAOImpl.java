package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import bean.MovieType;
import bean.Movies;
import jdbc.utils.JDBCUtils;

public class MoviesTypeDAOImpl extends BaseDAO implements MoviesTypeDAO{
	@Test
	public void Test() {
		Connection con = null;
		try {
			con = JDBCUtils.getConnection();
			
			MovieType movieType = new MovieType(0,"╛куд");
			insert(con, movieType);
			
			ArrayList<MovieType> list = getAll(con);
			for(MovieType a:list) 
				System.out.println(a);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtils.closeResource(con, null);
		}
	}
	@Override
	public void insert(Connection con, MovieType movieType) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into MovieType values(?)";
			update(con, sql, movieType.getMT_name());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<MovieType> getAll(Connection con) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from MovieType";
			return getForList(con, MovieType.class, sql);
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

}

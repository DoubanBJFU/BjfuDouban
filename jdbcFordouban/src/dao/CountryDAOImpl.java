package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import bean.Country;
import jdbc.utils.JDBCUtils;

public class CountryDAOImpl extends BaseDAO implements CountryDAO{

	@Test
	public void Test() {
		Connection con = null;
		try {
			con = JDBCUtils.getConnection();
			
			Country country = new Country(0,"JAN");
			insert(con, country);
			
			ArrayList<Country> list = getAll(con);
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
	public void insert(Connection con, Country country) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into Country values(?)";
			update(con, sql, country.getCountry_name());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Country> getAll(Connection con) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from Country";
			ArrayList<Country> list = getForList(con, Country.class, sql);
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

}

package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import bean.Movies;
import bean.Rates;
import jdbc.utils.JDBCUtils;

public class RatesDAOImpl extends BaseDAO implements RatesDAO{

	@Test
	public void Test() {
		Connection con = null;
		try {
			con = JDBCUtils.getConnection();
			
			Rates rates = new Rates(0,1,3,"y","нч","5");
			insert(con, rates);
			
			ArrayList<Rates> list = getAll(con);
			for(Rates rates2 : list)
				System.out.println(rates);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtils.closeResource(con, null);
		}
	}
	
	@Override
	public void insert(Connection con, Rates rates) {
		
		// TODO Auto-generated method stub
		try {
			String sql = "insert into Rates values(?,?,?,?,?)";
			update(con, sql, rates.getU_id(),rates.getM_id(),
					rates.getR_type(),rates.getR_comments(),rates.getR_stars());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Rates> getAll(Connection con) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from Rates";
			return getForList(con, Rates.class, sql);
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

package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import bean.MT_link;
import bean.Movies;
import jdbc.utils.JDBCUtils;

public class MT_linkDAOImpl extends BaseDAO implements MT_linkDAO{
	@Test
	public void Test() {
		Connection con = null;
		try {
			con = JDBCUtils.getConnection();
			
			/*MT_link mt_link = new MT_link(0,1,1);
			insert(con, mt_link);
			*/ArrayList<MT_link> list = getByMovId(con, 1);
			for(MT_link a:list)
				System.out.println(a);
			
			list = getByTypeId(con, 1);
			for(MT_link a:list)
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
	public void insert(Connection con, MT_link tag) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into MT_link values(?,?)";
			update(con, sql, tag.getMT_id(),tag.getM_id());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<MT_link> getByTypeId(Connection con, int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from MT_link where MT_id = ?";
			return getForList(con, MT_link.class, sql, id);
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
	public ArrayList<MT_link> getByMovId(Connection con, int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from MT_link where M_id = ?";
			return getForList(con, MT_link.class, sql, id);
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

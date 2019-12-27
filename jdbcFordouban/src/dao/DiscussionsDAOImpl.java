package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import bean.Discussions;
import jdbc.utils.JDBCUtils;

public class DiscussionsDAOImpl extends BaseDAO implements DiscussionsDAO{
	
	@Test
	public void Test() {
		Connection con= null;
		try {
			con = null;
			
			con = JDBCUtils.getConnection();
			
			Discussions discussions = new Discussions(0,2,2,1,"复仇者联盟","无");
			insert(con, discussions);
			
			discussions = new Discussions(0,2,2,1,"复仇者联盟2","无");
			updateById(con, 1, discussions);
			
			
			ArrayList<Discussions> list = getAll(con);
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JDBCUtils.closeResource(con, null);
		}
	}
	
	
	@Override
	public void insert(Connection con, Discussions discussions) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into Discussions values(?,?,?,?,?)";
			update(con, sql, discussions.getDis_parent_id(),discussions.getU_id(),
					discussions.getM_id(),discussions.getDis_title(),discussions.getDis_content());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteById(Connection con, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateById(Connection con, int id, Discussions discussions) {
		// TODO Auto-generated method stub
		try {
			String sql = "update Discussions set Dis_parent_id = ?,U_id = ?,M_id = ?,Dis_title = ?,Dis_content = ? where Dis_id = ?";
			update(con, sql, discussions.getDis_parent_id(),discussions.getU_id(),discussions.getM_id(),
					discussions.getDis_title(),discussions.getDis_content(),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Discussions getById(Connection con, int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select Dis_id,U_id,M_id,Dis_title,Dis_content from Discussions where Dis_id = ?";
			return getInstance(con, Discussions.class, sql, id);
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
	public ArrayList<Discussions> getAll(Connection con) {
		// TODO Auto-generated method stub
		try {
			String sql = "select Dis_id,U_id,M_id,Dis_title,Dis_content from Discussions";
			return getForList(con, Discussions.class, sql);
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
			String sql = "select count(*) from Discussions";
			return getValue(con, Discussions.class, sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
}

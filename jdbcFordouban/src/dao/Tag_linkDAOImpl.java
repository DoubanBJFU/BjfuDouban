package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Tag_link;

public class Tag_linkDAOImpl extends BaseDAO implements Tag_linkDAO {

	@Override
	public void insert(Connection con, Tag_link tag_link) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into Tag_link values(?,?)";
			update(con, sql,tag_link.getTag_id(),tag_link.getM_id());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Tag_link> getByTagId(Connection con, int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from Tag_link where Tag_id = ?";
			return getForList(con, Tag_link.class, sql, id);
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
	public ArrayList<Tag_link> getByMovId(Connection con, int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from Tag_link where M_id = ?";
			return getForList(con, Tag_link.class, sql, id);
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

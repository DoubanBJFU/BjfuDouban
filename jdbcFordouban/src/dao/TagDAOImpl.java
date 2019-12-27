package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Tag;

public class TagDAOImpl extends BaseDAO implements TagDAO{

	@Override
	public void insert(Connection con, Tag tag) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into Tag values(?)";
			update(con, sql, tag.getTag_name());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Tag> getAll(Connection con) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from Tag";
			return getForList(con, Tag.class, sql);
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

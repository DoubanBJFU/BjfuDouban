package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Staff;

public class StaffDAOImpl extends BaseDAO implements StaffDAO{

	@Override
	public void insert(Connection con, Staff staff) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into Staff values(?,?)";
			update(con, sql, staff.getStaff_id(),staff.getStaff_photo());
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
	public void updateById(Connection con, int id, Staff staff) {
		// TODO Auto-generated method stub
		try {
			String sql = "update Staff set Staff_name = ?,Staff_photo = ? where Staff_id = ?";
			update(con, sql, staff.getStaff_id(),staff.getStaff_photo(),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Staff getById(Connection con, int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from Staff where Staff_id = ?";
			return getInstance(con, Staff.class, sql, id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Staff> getAll(Connection con) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from Staff";
			return getForList(con, Staff.class, sql);
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
			String sql = "select count(*) from Staff";
			return getValue(con, Staff.class,sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
}

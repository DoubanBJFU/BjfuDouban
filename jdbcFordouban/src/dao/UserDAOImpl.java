package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Users;

public class UserDAOImpl extends BaseDAO implements UsersDAO{

	@Override
	public void insert(Connection con, Users users) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into Users values(?,?,?,?)";
			update(con, sql, users.getU_name(),users.getU_pwd(),users.getU_tel(),users.getU_email());
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
	public void updateById(Connection con, int id,Users users) {
		// TODO Auto-generated method stub
		try {
			String sql = "update Users set U_name = ?,U_pwd = ?,U_tel = ?,U_email = ? where U_id = ?";
			update(con, sql, users.getU_name(),users.getU_pwd(),users.getU_tel(),users.getU_email(),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Users getById(Connection con, int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from User where U_id = ?";
			return getInstance(con, Users.class, sql, id);
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
	public ArrayList<Users> getAll(Connection con) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from Users";
			return getForList(con, Users.class, sql);
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
			String sql = "select count(*) from Users";
			return getValue(con, Users.class, sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}

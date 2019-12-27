package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.*;

public interface StaffDAO {
	void insert(Connection con,Staff staff);
	
	void deleteById(Connection con,int id);

	void updateById(Connection con,int id,Staff staff);
	
	Staff getById(Connection con,int id);
	
	ArrayList<Staff> getAll(Connection con);
	
	int getCount(Connection con);

}

package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.Awards;

public interface AwardsDAO {
	void insert(Connection con,Awards awards);
	
	Awards getById(Connection con,int id);
	
	ArrayList<Awards> getAll(Connection con);
	
	int getCount(Connection con);
	
}

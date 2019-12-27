package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.*;

public interface DiscussionsDAO {
	void insert(Connection con,Discussions discussions);
	
	void deleteById(Connection con,int id);

	void updateById(Connection con,int id,Discussions discussions);
	
	Discussions getById(Connection con,int id);
	
	ArrayList<Discussions> getAll(Connection con);
	
	int getCount(Connection con);
}

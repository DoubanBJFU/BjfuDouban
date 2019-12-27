package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.*;

public interface MovieDAO {
	void insert(Connection con,Movies movies);//插入信息
	
	void deleteById(Connection con,int id);//按ID删除
	
	void updateById(Connection con,int id,Movies movies);
	
	Movies getById(Connection con,int id);
	
	ArrayList<Movies> getAll(Connection con);
	
	int getCount(Connection con);
}

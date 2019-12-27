package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.*;

public interface MovieDAO {
	void insert(Connection con,Movies movies);//������Ϣ
	
	void deleteById(Connection con,int id);//��IDɾ��
	
	void updateById(Connection con,int id,Movies movies);
	
	Movies getById(Connection con,int id);
	
	ArrayList<Movies> getAll(Connection con);
	
	int getCount(Connection con);
}

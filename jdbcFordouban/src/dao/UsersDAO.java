package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.*;

public interface UsersDAO {
	void insert(Connection con,Users users);//新增用户\
	
	void deleteById(Connection con,int id);//按ID删除
	
	void updateById(Connection con,int id,Users users);//按Id更新
	
	Users getById(Connection con,int id);//按ID查询
	
	ArrayList<Users>getAll(Connection con);//得到所有
	
	int getCount(Connection con);//COUNT(*)
}

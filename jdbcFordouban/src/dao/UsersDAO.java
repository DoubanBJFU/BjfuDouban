package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.*;

public interface UsersDAO {
	void insert(Connection con,Users users);//�����û�\
	
	void deleteById(Connection con,int id);//��IDɾ��
	
	void updateById(Connection con,int id,Users users);//��Id����
	
	Users getById(Connection con,int id);//��ID��ѯ
	
	ArrayList<Users>getAll(Connection con);//�õ�����
	
	int getCount(Connection con);//COUNT(*)
}

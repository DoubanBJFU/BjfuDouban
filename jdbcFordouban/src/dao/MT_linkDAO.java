package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.*;

public interface MT_linkDAO {
	void insert(Connection con,MT_link tag);
	ArrayList<MT_link> getByTypeId(Connection con,int id);
	ArrayList<MT_link> getByMovId(Connection con,int id);
}

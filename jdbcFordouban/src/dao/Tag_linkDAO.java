package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.*;

public interface Tag_linkDAO {
	void insert(Connection con,Tag_link tag_link);
	ArrayList<Tag_link> getByTagId(Connection con,int id);
	ArrayList<Tag_link> getByMovId(Connection con,int id);
}

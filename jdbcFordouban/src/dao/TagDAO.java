package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.Tag;

public interface TagDAO {
	void insert(Connection con,Tag tag);
	ArrayList<Tag> getAll(Connection con);
}

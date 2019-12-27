package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.*;

public interface CountryDAO {
	void insert(Connection con,Country country);
	ArrayList<Country> getAll(Connection con);
}

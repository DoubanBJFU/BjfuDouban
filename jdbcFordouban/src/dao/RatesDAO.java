package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.*;

public interface RatesDAO {
	void insert(Connection con,Rates rates);
	ArrayList<Rates> getAll(Connection con);
}

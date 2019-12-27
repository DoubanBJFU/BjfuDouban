package dao;

import java.sql.Connection;
import java.util.ArrayList;

import bean.*;

public interface MoviesTypeDAO {
	void insert(Connection con,MovieType movieType);
	ArrayList<MovieType> getAll(Connection con);
}

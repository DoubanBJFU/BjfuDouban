package jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class JDBCUtils {
	//获取数据库连接
	public static Connection getConnection() throws Exception {
		//加载sql类及其驱动器
		Class clazz=Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");           
        String url = "jdbc:sqlserver://123.56.144.145:1433;databaseName=Doban";
        Connection con = DriverManager.getConnection(url,"sa","shujukukeshe");
        System.out.println("连接成功");
        return con;
	}
	
	
	//关闭连接和信使
	public static void closeResource(Connection con,PreparedStatement ps) {
		try {
			if(ps!=null)
				ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(con!=null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//关闭连接，信使，结果集
	public static void closeResource(Connection con,PreparedStatement ps,ResultSet res) {
		try {
			if(ps!=null)
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(con!=null)
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(res!=null)
			res.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1() throws Exception {
		Connection con = getConnection();
	}
	
}

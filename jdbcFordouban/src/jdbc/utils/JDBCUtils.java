package jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class JDBCUtils {
	//��ȡ���ݿ�����
	public static Connection getConnection() throws Exception {
		//����sql�༰��������
		Class clazz=Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");           
        String url = "jdbc:sqlserver://123.56.144.145:1433;databaseName=Doban";
        Connection con = DriverManager.getConnection(url,"sa","shujukukeshe");
        System.out.println("���ӳɹ�");
        return con;
	}
	
	
	//�ر����Ӻ���ʹ
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
	
	//�ر����ӣ���ʹ�������
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

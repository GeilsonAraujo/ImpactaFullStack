package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	static Connection connection;
	
	public static Connection getConnection() {
		
		if(connection != null) {
			return connection;
		}else {
			String url = "jdbc:h2:file:C:/data/quiz";
			String dbName = "tjw";
			String uname = "admin";
			String pwd = "123";
			
			try {
				Class.forName("org.h2.Driver");
				connection = DriverManager.getConnection(url+dbName,uname,pwd);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				// TODO: handle exception
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}return connection;
			
		}
		
		
	}
}

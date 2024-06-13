package com.ey.jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {
	
	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","pass@word1");
		return con;
	}

}

package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB2 
{
	public static Connection con()
	{
		Connection connection=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/asian?user=root&password=root");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
}

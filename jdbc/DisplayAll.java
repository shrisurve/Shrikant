package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayAll 
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from student");
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
			
		}
	}
}

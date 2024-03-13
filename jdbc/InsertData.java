package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertData 
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		
		Statement statement=connection.createStatement();
		
		statement.execute("insert into student values(6,'Ajay','Pune','999999976')");
		System.out.println("Data Inserted Successfully");
	}
}

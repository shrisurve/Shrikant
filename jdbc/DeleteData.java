package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteData 
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		Statement statement=connection.createStatement();
		
		statement.execute("DELETE from student WHERE id=6");
		
		System.out.println("Data Deleted Successfully");
	}
}

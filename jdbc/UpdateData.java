package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateData 
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		Statement statement=connection.createStatement();
		
		statement.executeUpdate("UPDATE student SET name='Hindavi' WHERE id=9");
		
		System.out.println("Updated Successfully");
	}
}

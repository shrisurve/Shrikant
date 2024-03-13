package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Search 
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * from student WHERE id=?");
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the id for Search Student: ");
		int id=scanner.nextInt();
		
		preparedStatement.setInt(1, id);
		
		preparedStatement.execute();
		ResultSet resultSet=preparedStatement.getResultSet();
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
		}
		System.out.println("Data Fetched Sucessfully");
		
	}
}

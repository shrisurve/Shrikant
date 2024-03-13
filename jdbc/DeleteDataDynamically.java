package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDataDynamically 
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		
		PreparedStatement preparedStatement=connection.prepareStatement("DELETE from student WHERE id=?");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Id for Delete: ");
		int id=scanner.nextInt();
		
		preparedStatement.setInt(1, id);
		
		preparedStatement.execute();
		
		System.out.println("Data Deleted Successfully");
	}
}

package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDataDyanamically
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE student SET name=? WHERE id=?");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the New Name to be Updated: ");
		String name=scanner.nextLine();
		
		System.out.println("Enter the Id:");
		int id=scanner.nextInt();
		
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, id);
		
		preparedStatement.execute();
		
		System.out.println("Updated Successfully");
	}
}

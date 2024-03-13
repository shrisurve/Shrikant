package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDataDyanamically 
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?)");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Unique Id: ");
		int id=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the Name: ");
		String name=scanner.nextLine();
		
		System.out.println("Enter the Address: ");
		String address=scanner.nextLine();
		
		System.out.println("Enter the MobNo: ");
		String mobno=scanner.nextLine();
		
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, address);
		preparedStatement.setString(4, mobno);
		
		preparedStatement.execute();
		System.out.println("Data Inserted Successfully");
	}
}

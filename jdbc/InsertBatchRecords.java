package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertBatchRecords 
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?)");
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter How many Record you Want: ");
		int num=scanner.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Unique Id: ");
			int id=scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Enter the Name: ");
			String name=scanner.nextLine();
			
			System.out.println("Enter the Addreass: ");
			String address=scanner.nextLine();
			
			System.out.println("Enter the MobNo: ");
			String mobno=scanner.nextLine();
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, mobno);
			
			preparedStatement.addBatch();
			
		}
		preparedStatement.executeBatch();
		
		System.out.println("All Data Inserted Successfully");
	}
}

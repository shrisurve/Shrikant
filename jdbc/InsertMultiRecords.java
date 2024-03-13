package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMultiRecords 
{
	public static void main(String[] args)  throws Exception
	{
		Connection connection=DB2.con();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?)");
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How many Record You Want: ");
		int num=scanner.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Unique Id: ");
			int id=scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Enter Name: ");
			String name=scanner.nextLine();
			
			System.out.println("Enter Address: ");
			String address=scanner.nextLine();
			
			System.out.println("Enter PhNo: ");
			String phno=scanner.nextLine();
			
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, phno);
			
			preparedStatement.execute();
			
			System.out.println("Inserted Successfullt");
		}
		
	}
}

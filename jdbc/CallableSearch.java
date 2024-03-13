package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class CallableSearch 
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		CallableStatement callableStatement=connection.prepareCall("call search(1)");
		ResultSet resultSet=callableStatement.executeQuery();
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
		}
	}
}

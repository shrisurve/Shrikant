package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.CallableStatement;

public class CallableDisplay
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		CallableStatement callableStatement=connection.prepareCall("call displayAll()");
		ResultSet resultSet=callableStatement.executeQuery();
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
		}
	}
}

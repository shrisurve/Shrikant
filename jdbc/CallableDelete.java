package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;

public class CallableDelete 
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		CallableStatement callableStatement=connection.prepareCall("call deleteData(14)");
		callableStatement.execute();
	}
}

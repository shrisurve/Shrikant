package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class CallableInsert 
{
	public static void main(String[] args) throws Exception
	{
		Connection connection=DB2.con();
		CallableStatement callableStatement=connection.prepareCall("call insertData(14,'Nari','Pari','0000000000')");
		callableStatement.execute();
	}
}

package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CallableUpdate 
{
	public static void main(String[] args) throws Exception
	{
		
		Connection connection=DB2.con();
		CallableStatement callableStatement=connection.prepareCall("call UpdateData('Poonam',9)");
		callableStatement.execute();
	}
}

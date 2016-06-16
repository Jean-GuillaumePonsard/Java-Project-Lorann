package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBLorannGame {

	private final DBConnection connection;
	
	public DBLorannGame() {
		this.connection = new DBConnection();
	}
	
	public ResultSet procedure(String sqlprocedure, int id)
	{
		try {
			final CallableStatement call = this.connection.getConnection().prepareCall(sqlprocedure);
			call.setInt(1, id);
			call.execute();
			return call.getResultSet();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
}

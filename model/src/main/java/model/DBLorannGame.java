package model;

import java.sql.CallableStatement;
//import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *  The Class DBLorannGame
 * 
 * @author Jean-Guillaume Ponsard
 */

public class DBLorannGame {

	/** The database connection */
	private final DBConnection connection;
	
	/**
	 * Instantiates the connection
	 */
	public DBLorannGame() {
		this.connection = new DBConnection();
	}
	
	/**
	 *  Executes the procedure and return the ResultSet
	 * 
	 * @param sqlprocedure
	 * @param id
	 * @return null or the resultset
	 */
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

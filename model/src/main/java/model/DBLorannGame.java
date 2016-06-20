package model;

import java.sql.CallableStatement;
//import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *  The Class DBLorannGame
 * 
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
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
	 * @param sqlProcedure
	 * 	The name of the procedure that needs to be used
	 * @param id
	 * 	The id of the map
	 * @return null or the resultset
	 */
	public ResultSet procedure(String sqlProcedure, int id)
	{
		try {
			final CallableStatement call = this.connection.getConnection().prepareCall(sqlProcedure);
			call.setInt(1, id);
			call.execute();
			return call.getResultSet();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
}

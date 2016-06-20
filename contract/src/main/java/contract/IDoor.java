package contract;

/**
 * The interface IDoor
 * 
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public interface IDoor {

	/**
	 * Sets the gateStatement.
	 *
	 * @param GateStatement
	 *          the new gateStatement
	 */
	void setGateStatement(GateStatement gateStatement);

	/**
	 * Gets the gateStatement.
	 *
	 * @return the GateStatement of the door
	 */

	GateStatement getGateStatement();

}
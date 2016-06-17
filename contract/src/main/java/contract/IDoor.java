package contract;

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
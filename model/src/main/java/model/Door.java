package model;

/**
 * The Class Door.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Door extends MotionlessElement {

	/** The Gate Statement, if it closed or opened */
	public GateStatement gateStatement;
	
	/**
	 * Instantiates a new door.
	 */
	public Door(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
		setGateStatement(GateStatement.LOCK);
	}
	
	
	/**
	 * Sets the gateStatement.
	 *
	 * @param GateStatement
	 *          the new gateStatement
	 */
	public void setGateStatement(GateStatement gateStatement)
	{
		this.gateStatement = gateStatement;
	}
	
	/**
	 * Gets the gateStatement.
	 *
	 * @return the GateStatement of the door
	 */
	
	public GateStatement getGateStatement()
	{
		return this.gateStatement;
	}
}

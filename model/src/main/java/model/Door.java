package model;

import contract.GateStatement;
import contract.IDoor;
import contract.Permeability;

/**
 * The Class Door.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Door extends MotionlessElement implements IDoor {

	/** The Gate Statement, if it closed or opened */
	public GateStatement gateStatement;
	
	/**
	 * Instantiates a new door.
	 *  
	 * @param x
	 * @param y
	 * @param url
	 */
	public Door(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
		setGateStatement(GateStatement.LOCK);
	}
	
	
	/* (non-Javadoc)
	 * @see model.IDoor#setGateStatement(model.GateStatement)
	 */
	public void setGateStatement(GateStatement gateStatement)
	{
		this.gateStatement = gateStatement;
		modelchanged();
	}
	
	/* (non-Javadoc)
	 * @see model.IDoor#getGateStatement()
	 */
	
	public GateStatement getGateStatement()
	{
		return this.gateStatement;
	}
}

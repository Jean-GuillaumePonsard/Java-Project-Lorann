package model;

import contract.GateStatement;
import contract.IDoor;
import contract.Permeability;

/**
 * The Class Door.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class Door extends MotionlessElement implements IDoor {

	/** The Gate Statement, if it closed or opened */
	public GateStatement gateStatement;
	
	/**
	 * Instantiates a new door.
	 *  
	 * @param x
	 * The x position of the door
	 * @param y
	 * 	The y position of the door
	 * @param url
	 * 	The path of the image
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
		modelChanged();
	}
	
	/* (non-Javadoc)
	 * @see model.IDoor#getGateStatement()
	 */
	
	public GateStatement getGateStatement()
	{
		return this.gateStatement;
	}
}

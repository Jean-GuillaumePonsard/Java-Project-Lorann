package model;

import contract.IFloor;
import contract.Permeability;

/**
 * The Class Floor.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class Floor extends MotionlessElement implements IFloor {

	/** 
	 *	Instantiates a new Floor.
	 * 
	 * @param x
	 * @param y
	 * @param url
	 */
	
	public Floor(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}
}

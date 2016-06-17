package model;

import contract.Permeability;

/**
 * The Class Loot.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Loot extends MotionlessElement {

	/** 
	 *	Instantiates a new Loot
	 * 
	 * @param x
	 * @param y
	 * @param url
	 */
	
	public Loot(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}
}

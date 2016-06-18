package model;

import contract.ILoot;
import contract.Permeability;

/**
 * The Class Loot.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Loot extends MotionlessElement implements ILoot {

	/** Points given when picks loot */
	private int pointsGiven;
	
	/** 
	 *	Instantiates a new Loot
	 * 
	 * @param x
	 * @param y
	 * @param url
	 */
	
	public Loot(int x, int y, String url, int pointsGiven)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
		this.pointsGiven = pointsGiven;
	}
	
	public int getPointsGiven()
	{
		return this.pointsGiven;
	}
}

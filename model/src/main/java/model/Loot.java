package model;

import contract.ILoot;
import contract.Permeability;

/**
 * The Class Loot.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class Loot extends MotionlessElement implements ILoot {

	/** Points given when picks loot */
	private int pointsGiven;
	
	/** 
	 *	Instantiates a new Loot
	 * 
	 * @param x
	 * 	The x position of the loot
	 * @param y
	 * 	The y position of the loot
	 * @param url
	 * 	The path of the image
	 * @param pointsGiven
	 * 	The amount of points given when catching the loot
	 */
	
	public Loot(int x, int y, String url, int pointsGiven)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
		this.pointsGiven = pointsGiven;
	}
	
	/*
	 * (non-Javadoc)
	 * @see contract.ILoot#getPointsGiven()
	 */
	
	public int getPointsGiven()
	{
		return this.pointsGiven;
	}
}

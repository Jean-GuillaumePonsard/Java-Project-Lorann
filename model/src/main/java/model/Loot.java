package model;

/**
 * The Class Loot.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Loot extends MotionlessElement {

	/** 
	 *	Instantiates a new Loot 
	 */
	
	public Loot(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}
}

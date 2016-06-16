package model;

/**
 * The Class Monster.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Monster extends MotionElement {

	/** 
	 *	Instantiates a new monster.
	 * 
	 * @param x
	 * @param y
	 * @param url
	 */
	
	public Monster(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}
}

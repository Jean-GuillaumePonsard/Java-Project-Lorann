package model;

/**
 * The Class Monster.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Monster extends MotionElement {

	/** 
	 *	Instantiates a new monster 
	 */
	
	public Monster(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}
}

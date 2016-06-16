package model;

/**
 * The Class Wall.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Wall extends MotionlessElement {

	/** 
	 *	Instantiates a new wall 
	 */
	
	public Wall(int x, int y, String url)
	{
		super(url, Permeability.BLOCKING);
		setX(x);
		setY(y);
	}
}

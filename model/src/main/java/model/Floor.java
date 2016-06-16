package model;

/**
 * The Class Floor.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Floor extends MotionlessElement {

	/** 
	 *	Instantiates a new Floor 
	 */
	
	public Floor(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}
}

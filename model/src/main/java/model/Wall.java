package model;

import contract.IWall;
import contract.Permeability;

/**
 * The Class Wall.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Wall extends MotionlessElement implements IWall {

	/** 
	 *	Instantiates a new wall.
	 * 
	 * @param x
	 * @param y
	 * @param url
	 */
	
	public Wall(int x, int y, String url)
	{
		super(url, Permeability.BLOCKING);
		setX(x);
		setY(y);
	}
}

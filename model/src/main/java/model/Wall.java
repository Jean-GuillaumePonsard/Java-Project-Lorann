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
	 * 	The x position of the wall
	 * @param y
	 * 	The y position of the wall
	 * @param url
	 * 	The path of the image
	 */
	
	public Wall(int x, int y, String url)
	{
		super(url, Permeability.BLOCKING);
		setX(x);
		setY(y);
	}
}

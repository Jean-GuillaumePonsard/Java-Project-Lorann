package model;

import contract.IMonster;
import contract.Permeability;

/**
 * The Class Monster.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class Monster extends MotionElement implements IMonster {

	/** 
	 *	Instantiates a new monster.
	 * 
	 * @param x
	 * 	The x position of the monster
	 * @param y
	 * 	The y position of the monster
	 * @param url
	 * 	The path of the image
	 */
	
	public Monster(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}
}

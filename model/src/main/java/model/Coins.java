package model;

import contract.ICoins;

/**
 * The Class Coins.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class Coins extends Loot implements ICoins {

	/**
	 * Instantiates a new coins.
	 * 
	 * @param x
	 * 	The x position of the coins
	 * @param y
	 * 	The y position of the coins
	 * @param url
	 * 	The path of the image
	 */
	public Coins(int x, int y, String url) {
		super(x, y, url, 500);
		// TODO Auto-generated constructor stub
	}

}

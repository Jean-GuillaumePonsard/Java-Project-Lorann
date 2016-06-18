package model;

import contract.ICoins;

/**
 * The Class Coins.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Coins extends Loot implements ICoins {

	/**
	 * Instantiates a new coins.
	 * 
	 * @param x
	 * @param y
	 * @param url
	 */
	public Coins(int x, int y, String url) {
		super(x, y, url, 500);
		// TODO Auto-generated constructor stub
	}

}

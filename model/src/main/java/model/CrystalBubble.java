package model;

import contract.ICrystalBubble;

/**
 * The Class CrystalBubble.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class CrystalBubble extends Loot implements ICrystalBubble {

	/**
	 * Instantiates a new CrystalBubble.
	 *  
	 * @param x
	 * @param y
	 * @param url
	 */
	public CrystalBubble(int x, int y, String url) {
		super(x, y, url, 1000);
		// TODO Auto-generated constructor stub
	}

}

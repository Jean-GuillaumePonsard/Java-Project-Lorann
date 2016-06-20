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
	 * 	The x position of the crystal bubble
	 * @param y
	 * 	The y position of the crystal bubble
	 * @param url
	 * 	The path of the image
	 */
	public CrystalBubble(int x, int y, String url) {
		super(x, y, url, 1000);
		// TODO Auto-generated constructor stub
	}

}

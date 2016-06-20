package model;

import contract.Permeability;

/**
 * The Class MotionlessElement.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class MotionlessElement extends Element {

	/** 
	 *	Instantiates a new MotionlessElement 
	 *
	 * @param url
	 * 	The path of the image
	 * @param permeability
	 * 	The permeability of the motionless element
	 */
	
	public MotionlessElement(String url, Permeability permeability)
	{
		super(url, permeability);
	}
}

package model;

import contract.Permeability;

/**
 * The Class MotionElement.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class MotionElement extends Element {

	/** 
	 *	Instantiates a new mobileElement.
	 *
	 * @param url
	 * 	The path of the image
	 * @param permeability
	 * 	The permeability of the motion element
	 */
	
	public MotionElement(String url, Permeability permeability)
	{
		super(url, permeability);
	}
}

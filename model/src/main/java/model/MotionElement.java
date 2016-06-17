package model;

import contract.Permeability;

/**
 * The Class MotionElement.
 *
 * @author Jean-Guillaume Ponsard
 */

public class MotionElement extends Element {

	/** 
	 *	Instantiates a new mobileElement.
	 *
	 * @param url
	 * @param permeability
	 */
	
	public MotionElement(String url, Permeability permeability)
	{
		super(url, permeability);
	}
}

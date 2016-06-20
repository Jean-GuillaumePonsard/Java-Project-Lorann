package contract;

import contract.ControllerOrder;

/**
 * The interface ILorannController
 * 
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public interface ILorannController {

	/**
	 * Moves Lorann due to a key pressed
	 *
	 * @param controllerOrder
	 * 	The order that the user performed
	 */
	void orderPerform(ControllerOrder controllerOrder);
	

	/**
	* Moves the Ai
	*/

	void monsterAi();
	
	
	
	/** Moves the spell when launched
	 * 
	 */
	
	void moveSpell();

}
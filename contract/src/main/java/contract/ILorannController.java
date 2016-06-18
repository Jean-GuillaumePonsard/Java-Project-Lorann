package contract;

import contract.ControllerOrder;

public interface ILorannController {

	/**
	 * Moves Lorann due to a key pressed
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
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
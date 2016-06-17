package contract;

import contract.ControllerOrder;

public interface ILorannController {

	/**
	 * Move Lorann due to a key pressed
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	void orderPerform(ControllerOrder controllerOrder);

}
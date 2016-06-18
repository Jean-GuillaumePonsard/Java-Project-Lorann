package contract;

import java.util.Observable;

public interface ILorannGame {

	/**
	 * Gets the LorannMap.
	 * 
	 * @return the Map
	 */
	ILorannMap getLorannMap();

	/**
	 * Sets the lorannMap.
	 *
	 * @param lorannMap
	 *          the new lorannMap
	 */

	void setLorannMap(ILorannMap lorannMap);
	
	/**
	 * Allows to notifyObservers
	 * 
	 */
	
	void changeLorannGame();

	/**
	 * Gets the Observable.
	 * 
	 * @return the Observable
	 */
	
	Observable getObservable();
}
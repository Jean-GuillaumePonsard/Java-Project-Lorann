package contract;

import java.util.Observable;

public interface ILorannGame {

	/**
	 * Get LorannMap.
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
	 * Allow to notifyObservers
	 * 
	 */
	
	void changeLorannGame();


	Observable getObservable();
}
package contract;

import java.util.Observable;

/**
 * The interface ILorannGame
 * 
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

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
	 * Allows to notify Observers that changes have been made
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
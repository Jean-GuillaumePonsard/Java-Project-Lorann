package contract;

import java.awt.Dimension;
import java.util.Observable;

import javax.swing.Icon;

/**
 * The Interface IModel.
 *
 * @author Franz Alliod
 */
public interface IModel {

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	String getMessage();

	/**
	 * Load the message.
	 *
	 * @param key
	 *          the key
	 */
	void loadMessage(String key);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
	
	
	
 // TO DO
	
	
	
	
	int getDimensionMapX();
	
	int getDimensionMapY();
	
/** Dimension encapsulates the width and height of a component in a single object
 * 
 * 
 * @return the Dimension
 */
	
	Dimension getD();
	

	Icon getImageElement(int y, int x);
	
	int getScore();
}

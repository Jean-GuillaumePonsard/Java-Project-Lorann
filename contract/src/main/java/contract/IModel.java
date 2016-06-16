package contract;

import java.awt.Dimension;
import java.util.Observable;

import javax.swing.Icon;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
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
	
	
	Dimension getD();
	
	int getDimensionMapX();
	
	int getDimensionMapY();

	int getScore();

	Icon getImageElement(int y, int x);
}

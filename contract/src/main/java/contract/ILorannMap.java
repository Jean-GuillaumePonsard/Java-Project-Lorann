package contract;

import java.util.ArrayList;
import java.util.Observable;

/**
 * The interface ILorannMap
 * 
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public interface ILorannMap {

	/**
	 * Gets all elements
	 * 
	 * @return elements
	 */
	IElement[][] getElements();

	/**
	 * Adds elements in the table
	 * 
	 * need improvement to check the value of x and y
	 * 
	 * @param element
	 * @param x
	 * @param y
	 */

	void addElement(IElement element, int x, int y);

	/**
	 * Sets elements in the table. Equals to addElement
	 * Need a lot of improvement to not looks like addElement
	 * 
	 * 
	 * @param element
	 * @param x
	 * @param y
	 */

	void setElement(IElement element, int x, int y);

	/**
	 * Gets element by x and y positions
	 * 
	 * @param x
	 * @param y
	 * @return elements or null
	 */

	IElement getElement(int x, int y);

	/**
	 * Gets widht
	 * 
	 * @return width
	 */

	int getWidth();

	/**
	 * Gets height
	 * 
	 * @return height
	 */

	int getHeight();

	/**
	 * Gets Lorann
	 * 
	 * @return lorann
	 */

	IElement getLorann();

	/**
	 * Sets Lorann
	 * 
	 * @param lorann
	 */

	void setLorann(IElement lorann);

	/**
	 * Gets all monsters
	 * 
	 * @return monsters
	 */

	ArrayList<IMonster> getMonsters();

	/**
	 * Sets all monsters
	 * 
	 * @param monsters
	 */

	void setMonsters(ArrayList<IMonster> monsters);

	/**
	 * Adds a monster in ArrayList
	 * 
	 * @param monster
	 */

	void addMonster(IMonster monster);

	/**
	 * Removes a monster by its index in the ArrayList
	 * 
	 * @param index
	 */

	void removeMonsterByIndex(int index);

	/**
	 * Gets Lorann's Spell.
	 * 
	 * @return lorannSpell
	 */

	IElement getLorannSpell();

	/**
	 * Sets Lorann's Spell
	 * 
	 * @param lorannSpell
	 */

	void setLorannSpell(IElement lorannSpell);
	
	
	/** Destroys the Element
	 * 
	 * @param x
	 * @param y
	 */
	
	
	void destroyElement(final int x, final int y);
	
	/** Opens the door
	 * 
	 */
	
	void openDoor();
	
	/**
	 * Moves the Element. The x position of the element is incremented by x and y
	 * 
	 * @param element
	 * @param x
	 * @param y
	 */
	
	void moveElement(IElement element, final int x, final int y);
	
	/**
	 * Notify Observer that the model changed
	 * 
	 */
	
	void modelChanged();
	
	/**
	 * Gets the observable
	 * 
	 * @return Observable
	 */
	
	Observable getObservable();

}
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
	 * @param element
	 * 	An element that needs to be add
	 * @param x
	 * 	The x position of the element in the map
	 * @param y
	 * 	The y position of the element in the map
	 */

	void addElement(IElement element, int x, int y);

	/**
	 * Sets elements in the table.
	 * 
	 * 
	 * @param element
	 * An element that will replace another element
	 * @param x
	 * 	The x position of the element in the map
	 * @param y
	 * 	The y position of the element in the map
	 */

	void setElement(IElement element, int x, int y);

	/**
	 * Gets element by x and y positions
	 * 
	 * @param x
	 * 	The x position of the element needed
	 * @param y
	 * 	The y position of the element needed
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
	 * 	The new lorann, our hero
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
	 * 	The ArrayList of monsters
	 */

	void setMonsters(ArrayList<IMonster> monsters);

	/**
	 * Adds a monster in ArrayList
	 * 
	 * @param monster
	 * 	The new monster that needs to be added
	 */

	void addMonster(IMonster monster);

	/**
	 * Removes a monster by its index in the ArrayList
	 * 
	 * @param index
	 * 	The position of the monster in the ArrayList
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
	 * 	Lorann's spell
	 */

	void setLorannSpell(IElement lorannSpell);
	
	
	/** Destroys the Element
	 * 
	 * @param x
	 * 	The x position of an element that needs to be replace by floor
	 * @param y
	 * 	The y position of an element that needs to be replace by floor
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
	 * 	The element that needs to be moved (lorann, his spell or a monster)
	 * @param x
	 * 	The x movement of the element
	 * @param y
	 * 	The y movement of the element
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
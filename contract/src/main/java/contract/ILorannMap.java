package contract;

import java.util.ArrayList;

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
	 * @deprecated
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
	 * Add a monster in ArrayList
	 * 
	 * @param monster
	 */

	void addMonster(IMonster monster);

	/**
	 * Remove a monster by its index in the ArrayList
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
	
	void destroyElement(final int x, final int y);
	
	void openDoor();

}
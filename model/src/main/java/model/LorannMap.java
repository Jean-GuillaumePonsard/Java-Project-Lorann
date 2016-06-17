package model;

import java.util.ArrayList;

/**
 * The Class LorannMap.
 *
 * @author Jean-Guillaume Ponsard
 */

public class LorannMap {

	
	/** Table of Element that are in the map and need to be displayed. */
	private Element elements[][];
	
	/** Lorann, the hero of the game. */
	private Lorann lorann;
	
	/** Array List of monster */
	private ArrayList<Monster> monsters = new ArrayList<Monster>();
	
	/** Lorann's spell */
	private Spell lorannSpell;
	
	/** widht of the map. */
	private int widht;
	
	/** height of the map. */
	private int height;
	
	/**
	 * Instantiates a new LorannMap
	 * 
	 * @param widht
	 * @param height
	 */
	public LorannMap(int widht, int height)
	{
		this.widht = widht;
		this.height = height;
		this.elements = new Element[this.getWidht()][this.getHeight()];	
	}
	
	/**
	 * Gets all elements
	 * 
	 * @return elements
	 */
	public Element[][] getElements() {
		return elements;
	}
	
	/**
	 * Adds elements in the table
	 * 
	 * need improvement to check the value of x and y
	 * 
	 * @param element
	 * @param x
	 * @param y
	 */
	
	public void addElement(Element element, final int x, final int y)
	{
		this.elements[x][y] = element;
	}

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

	public void setElement(Element element, int x, int y) {
		this.elements[x][y] = element;
	}
	
	/**
	 * Gets element by x and y positions
	 * 
	 * @param x
	 * @param y
	 * @return elements or null
	 */
	
	public Element getElement(int x, int y)
	{
		if(x < 0 || y <0 || x > this.getWidht() || y > this.getHeight())
		{
			return null;
		}
		
		return elements[x][y];
	}

	/**
	 * Gets widht
	 * 
	 * @return width
	 */

	public int getWidht() {
		return this.widht;
	}

	/**
	 * Gets height
	 * 
	 * @return height
	 */
	
	public int getHeight() {
		return this.height;
	}
	
	/**
	 * Gets Lorann
	 * 
	 * @return lorann
	 */
	
	public Lorann getLorann()
	{
		return this.lorann;
	}
	
	/**
	 * Sets Lorann
	 * 
	 * @param lorann
	 */
	
	public void setLorann(Lorann lorann)
	{
		this.lorann = lorann;
	}
	
	/**
	 * Gets all monsters
	 * 
	 * @return monsters
	 */

	public ArrayList<Monster> getMonsters() {
		return monsters;
	}

	/**
	 * Sets all monsters
	 * 
	 * @param monsters
	 */
	
	public void setMonsters(ArrayList<Monster> monsters) {
		this.monsters = monsters;
	}
	
	/**
	 * Add a monster in ArrayList
	 * 
	 * @param monster
	 */

	public void addMonster(Monster monster)
	{
		monsters.add(monster);
	}
	
	/**
	 * Remove a monster by its index in the ArrayList
	 * 
	 * @param index
	 */
	
	public void removeMonsterByIndex(int index)
	{
		monsters.remove(index);
	}

	/**
	 * Gets Lorann's Spell.
	 * 
	 * @return lorannSpell
	 */
	
	public Spell getLorannSpell() {
		return lorannSpell;
	}

	/**
	 * Sets Lorann's Spell
	 * 
	 * @param lorannSpell
	 */
	
	public void setLorannSpell(Spell lorannSpell) {
		this.lorannSpell = lorannSpell;
	}
	
}

package model;

import java.util.ArrayList;

import contract.IElement;
import contract.ILorann;
import contract.ILorannMap;
import contract.IMonster;
import contract.ISpell;

/**
 * The Class LorannMap.
 *
 * @author Jean-Guillaume Ponsard
 */

public class LorannMap implements ILorannMap {

	
	/** Table of Element that are in the map and need to be displayed. */
	private IElement elements[][];
	
	/** Lorann, the hero of the game. */
	private IElement lorann;
	
	/** Array List of monster */
	private ArrayList<IMonster> monsters = new ArrayList<IMonster>();
	
	/** Lorann's spell */
	private IElement lorannSpell;
	
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
		this.elements = new IElement[this.getWidht()][this.getHeight()];	
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#getElements()
	 */
	public IElement[][] getElements() {
		return elements;
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#addElement(model.IElement, int, int)
	 */
	
	public void addElement(IElement element, final int x, final int y)
	{
		this.elements[x][y] = element;
	}

	/* (non-Javadoc)
	 * @see model.ILorannMap#setElement(model.IElement, int, int)
	 */

	public void setElement(IElement element, int x, int y) {
		this.elements[x][y] = element;
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#getElement(int, int)
	 */
	
	public IElement getElement(int x, int y)
	{
		if(x < 0 || y <0 || x > this.getWidht() || y > this.getHeight())
		{
			return null;
		}
		
		return elements[x][y];
	}

	/* (non-Javadoc)
	 * @see model.ILorannMap#getWidht()
	 */

	public int getWidht() {
		return this.widht;
	}

	/* (non-Javadoc)
	 * @see model.ILorannMap#getHeight()
	 */
	
	public int getHeight() {
		return this.height;
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#getLorann()
	 */
	
	public IElement getLorann()
	{
		return this.lorann;
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#setLorann(model.ILorann)
	 */
	
	public void setLorann(IElement lorann)
	{
		this.lorann = lorann;
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#getMonsters()
	 */

	public ArrayList<IMonster> getMonsters() {
		return monsters;
	}

	/* (non-Javadoc)
	 * @see model.ILorannMap#setMonsters(java.util.ArrayList)
	 */
	
	public void setMonsters(ArrayList<IMonster> monsters) {
		this.monsters = monsters;
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#addMonster(model.Monster)
	 */

	public void addMonster(IMonster monster)
	{
		monsters.add(monster);
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#removeMonsterByIndex(int)
	 */
	
	public void removeMonsterByIndex(int index)
	{
		monsters.remove(index);
	}

	/* (non-Javadoc)
	 * @see model.ILorannMap#getLorannSpell()
	 */
	
	public IElement getLorannSpell() {
		return lorannSpell;
	}

	/* (non-Javadoc)
	 * @see model.ILorannMap#setLorannSpell(model.Spell)
	 */
	
	public void setLorannSpell(IElement lorannSpell) {
		this.lorannSpell = lorannSpell;
	}

	
}

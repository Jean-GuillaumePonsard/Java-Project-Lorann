package model;

import java.util.ArrayList;
import java.util.Observable;

import contract.GateStatement;
import contract.IElement;
import contract.ILorannMap;
import contract.IMonster;

/**
 * The Class LorannMap.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class LorannMap extends Observable implements ILorannMap {

	
	/** Table of Element that are in the map and need to be displayed. */
	private IElement elements[][];
	
	/** Lorann, the hero of the game. */
	private IElement lorann;
	
	/** Array List of monster */
	private ArrayList<IMonster> monsters = new ArrayList<IMonster>();
	
	/** Lorann's spell */
	private IElement lorannSpell;
	
	/** width of the map. */
	private int width;
	
	/** height of the map. */
	private int height;
	
	/**
	 * Instantiates a new LorannMap
	 * 
	 * @param width
	 * 	The width of the map
	 * @param height
	 * 	The height of the map
	 */
	public LorannMap(int width, int height)
	{
		this.width = width;
		this.height = height;
		this.elements = new IElement[this.getWidth()][this.getHeight()];	
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
		if(this.elements[x][y] == null && x >= 0 && x < this.width && y < this.height && y >= 0)
		{
			this.elements[x][y] = element;
			modelChanged();
		}

	}

	/* (non-Javadoc)
	 * @see model.ILorannMap#setElement(model.IElement, int, int)
	 */

	public void setElement(IElement element, int x, int y) {
		if(x >= 0 && x < this.width && y < this.height && y >= 0)
		{
			this.elements[x][y] = element;
			modelChanged();
		}
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#getElement(int, int)
	 */
	
	public IElement getElement(int x, int y)
	{
		if(x < 0 || y <0 || x > this.getWidth() || y > this.getHeight())
		{
			return null;
		}
		
		return elements[x][y];
	}

	/* (non-Javadoc)
	 * @see model.ILorannMap#getWidht()
	 */

	public int getWidth() {
		return this.width;
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
		modelChanged();
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
		modelChanged();
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#addMonster(model.Monster)
	 */

	public void addMonster(IMonster monster)
	{
		monsters.add(monster);
		modelChanged();
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#removeMonsterByIndex(int)
	 */
	
	public void removeMonsterByIndex(int index)
	{
		monsters.remove(index);
		modelChanged();
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
		modelChanged();
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#destroyElement(int, int)
	 */
	
	public void destroyElement(final int x, final int y)
	{
		setElement(new Floor(x, y, "sprite/floor.png"), x, y);
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannMap#openDoor()
	 */
	
	public void openDoor()
	{
		int x = 0;
		for(IElement[] element: getElements())
		{
			int y = 0;
			for(IElement e: element)
			{
				if(e instanceof Door) {
					
					((Door)e).setGateStatement(GateStatement.OPEN);
					e.setImage("sprite/gate_open.png");
				}
				y++;
			}
			x++;
		}
	}
	
	/**
	 * Notify observers that the model changed
	 * 
	 */

	public void modelChanged()
	{
		setChanged();
		notifyObservers();
	}
	
	/*
	 * (non-Javadoc)
	 * @see contract.ILorannMap#getObservable()
	 */
	
	public Observable getObservable()
	{
		return this;
	}
	
	/*
	 * (non-Javadoc)
	 * @see contract.ILorannMap#moveElement(contract.IElement, int, int)
	 */
	
	public void moveElement(IElement element, final int x, final int y)
	{
		element.setX(element.getX()+x);
		element.setY(element.getY()+y);
		modelChanged();
	}

	
}

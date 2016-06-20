package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Observable;

import contract.ILorannGame;
import contract.ILorannMap;

/**
 * The Class LorannGame.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */


public class LorannGame extends Observable implements ILorannGame {

	/** The Lorann Game Map**/
	private ILorannMap lorannMap;
	
	/** The DataBase Connection that allow to get a Resultset **/
	private DBLorannGame dbLorannGame;
	
	
	/**
	 * Instantiates a new LorannGame.
	 * 
	 * @param idLevel
	 * 		The level choosen
	 */
	public LorannGame(int idLevel)
	{
		dbLorannGame = new DBLorannGame();
		initLorannMap(idLevel);
	}

	/* (non-Javadoc)
	 * @see model.ILorannGame#getLorannMap()
	 */
	public ILorannMap getLorannMap() {
		return lorannMap;
	}
	
	/* (non-Javadoc)
	 * @see model.ILorannGame#setLorannMap(model.LorannMap)
	 */

	public void setLorannMap(ILorannMap lorannMap) {
		this.lorannMap = lorannMap;
		changeLorannGame();
	}
	
	
	/**
	 * Initialization of lorannMap
	 * 
	 * Need to be improve for map choice
	 * 
	 */
	
	public void initLorannMap(int idLevel)
	{
		if(idLevel > 5 || idLevel <1)
		{
			idLevel = 1;
		}
		lorannMap = new LorannMap(20, 12);
		
		try {
			
			ResultSet result = dbLorannGame.procedure("call ElementByMap(?)", idLevel);
			while(result.next())
			{
				int idElement = result.getInt("idElement");
				int x = result.getInt("x");
				int y = result.getInt("y");
				String url = result.getString("url");
				
				switch(idElement)
				{
					case 1:
						lorannMap.addElement(new Floor(x, y, url), x, y);
						
						break;
						
					case 2:
						lorannMap.addElement(new Door(x, y, url), x, y);
						
						break;
						
					case 3: case 4: case 5:
						lorannMap.addElement(new Wall(x, y, url), x, y);
						
						break;
						
					case 6:
						lorannMap.addElement(new CrystalBubble(x, y, url), x, y);
						
						break;
						
					case 7:
						lorannMap.addElement(new Coins(x, y, url), x, y);
						
						break;
						
					case 8: case 9: case 10: case 11:
						//Create Floor and after create Monster
						lorannMap.addElement(new Floor(x, y, "sprite/floor.png"), x, y);
						lorannMap.addMonster(new Monster(x, y, url));
						
						break;
						
					case 12:
						//Create Floor and then create Lorann and his Spell
						lorannMap.addElement(new Floor(x, x, "sprite/floor.png"), x, y);
						lorannMap.setLorann(new Lorann(x, y, url));
						lorannMap.setLorannSpell(new Spell(x, y, "sprite/fireball_1.png"));
						
						break;
						
				}
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see contract.ILorannGame#changeLorannGame()
	 */
	
	public void changeLorannGame()
	{
		setChanged();
		notifyObservers();
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.ILorannGame#getObservable()
	 */
	public Observable getObservable() 
	{
		return this;
	}

	
}

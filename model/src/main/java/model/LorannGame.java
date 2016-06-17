package model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The Class LorannGame.
 *
 * @author Jean-Guillaume Ponsard
 */


public class LorannGame {

	/** The Lorann Game Map**/
	private LorannMap lorannMap;
	
	/** The DataBase Connection that allow to get a Resultset **/
	private DBLorannGame dbloranngame;
	
	
	/**
	 * Instantiates a new LorannGame.
	 */
	public LorannGame()
	{
		dbloranngame = new DBLorannGame();
		initLorannMap();
	}

	/**
	 * Get LorannMap.
	 * 
	 * @return the Map
	 */
	public LorannMap getLorannMap() {
		return lorannMap;
	}
	
	/**
	 * Sets the lorannMap.
	 *
	 * @param lorannMap
	 *          the new lorannMap
	 */

	public void setLorannMap(LorannMap lorannMap) {
		this.lorannMap = lorannMap;
	}
	
	
	/**
	 * Initialization of lorannMap
	 * 
	 * Need to be improve for map choice
	 * 
	 */
	public void initLorannMap()
	{
		lorannMap = new LorannMap(20, 12);
		
		try {
			
			ResultSet result = dbloranngame.procedure("call ElementByMap(?)", 1);
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
						System.out.println("Floor : X = "+x+"y = "+y+"url = "+url);
						break;
						
					case 2:
						lorannMap.addElement(new Door(x, y, url), x, y);
						System.out.println("Door : X = "+x+"y = "+y+"url = "+url);
						break;
						
					case 3: case 4: case 5:
						lorannMap.addElement(new Wall(x, y, url), x, y);
						System.out.println("Wall : X = "+x+"y = "+y+"url = "+url);
						break;
						
					case 6:
						lorannMap.addElement(new CrystalBubble(x, y, url), x, y);
						System.out.println("CrystalBubble : X = "+x+"y = "+y+"url = "+url);
						break;
						
					case 7:
						lorannMap.addElement(new Coins(x, y, url), x, y);
						System.out.println("Coins : X = "+x+"y = "+y+"url = "+url);
						break;
						
					case 8: case 9: case 10: case 11:
						//Create Floor and after create Monster
						lorannMap.addElement(new Floor(x, y, "sprite/floor.png"), x, y);
						lorannMap.addMonster(new Monster(x, y, url));
						System.out.println("Creating Element Floor then instantiate Monster : X = "+x+"y = "+y+"url = "+url);
						break;
						
					case 12:
						//Create Floor and then create Lorann and his Spell
						lorannMap.addElement(new Floor(x, x, "sprite/floor.png"), x, y);
						lorannMap.setLorann(new Lorann(x, y, url));
						lorannMap.setLorannSpell(new Spell(x, y, "sprite/fireball_1.png"));
						System.out.println("Creating Element Floor then instantiate Lorann : X = "+x+"y = "+y+"url = "+url+" and create his spell");
						break;
						
				}
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}

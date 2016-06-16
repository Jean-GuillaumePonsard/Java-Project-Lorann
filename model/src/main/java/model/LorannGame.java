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


	public void setLorannMap(LorannMap lorannMap) {
		this.lorannMap = lorannMap;
	}
	
	
	/**
	 * Initialization of lorannMap
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
						lorannMap.addElement(new Monster(x, y, url), x, y);
						System.out.println("Monster : X = "+x+"y = "+y+"url = "+url);
						break;
						
					case 12:
						//Create Floor and then create Lorann
						lorannMap.addElement(new Lorann(x, y, url), x, y);
						System.out.println("Lorann : X = "+x+"y = "+y+"url = "+url);
						break;
						
				}
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}

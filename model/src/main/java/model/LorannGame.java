package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LorannGame {

	private LorannMap lorannMap;
	private DBLorannGame dbloranngame;
	
	
	
	public LorannGame()
	{
		dbloranngame = new DBLorannGame();
		initLorannMap();
	}


	public LorannMap getLorannMap() {
		return lorannMap;
	}


	public void setLorannMap(LorannMap lorannMap) {
		this.lorannMap = lorannMap;
	}
	
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
						
						break;
				}
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}

package controller;

import contract.ILorannController;

/**
* The Class Ticks.
* 
* @author Adrien Thevenet
* @version 16.06.2016
*/

public class Ticks implements Runnable  {

	/** the LorannController. */
	private ILorannController lorannController;
	
	/*
	 * (non-javadoc)
	 * 
	 */
	public Ticks(ILorannController lorannController){
		this.lorannController = lorannController;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(true)
			{
				lorannController.monsterAi();
				lorannController.moveSpell();
				Thread.sleep(300);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

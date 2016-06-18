package controller;

import contract.ILorannController;

//TODO: Auto-generated Javadoc
/**
* The Class Controller.
* 
* @author 
*/

public class Ticks implements Runnable  {

	/** the LorannController. */
	private ILorannController loranncontroller;
	
	/*
	 * (non-javadoc)
	 * 
	 */
	public Ticks(ILorannController loranncontroller){
		this.loranncontroller = loranncontroller;
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
				loranncontroller.monsterAi();
				loranncontroller.moveSpell();
				Thread.sleep(300);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

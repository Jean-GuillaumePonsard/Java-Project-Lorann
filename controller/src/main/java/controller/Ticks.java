package controller;

import contract.ILorannController;

//TODO: Auto-generated Javadoc
/**
* The Class Controller.
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
		
	}
}

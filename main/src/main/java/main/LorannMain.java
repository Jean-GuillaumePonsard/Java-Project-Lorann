package main;

import controller.LorannController;
import model.LorannGame;
import view.LorannView;

/**
 * The LorannMain Class
 * 
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 *
 */

public abstract class LorannMain {

	/**
	 * The main method.
	 *
	 * @param args
	 *          the arguments
	 */
	
public static void main(final String[] args) {
	final LorannGame lorannGame = new LorannGame(1);
	final LorannView lorannView = new LorannView(lorannGame);
	final LorannController lorannController = new LorannController(lorannView, lorannGame);
	lorannView.setController(lorannController);

}

}
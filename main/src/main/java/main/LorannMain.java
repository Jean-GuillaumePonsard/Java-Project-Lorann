package main;

import controller.LorannController;
import model.LorannGame;
import view.LorannView;

public abstract class LorannMain {

	/**
	 * The main method.
	 *
	 * @param args
	 *          the arguments
	 */
	
public static void main(final String[] args) {
	final LorannGame lorannGame = new LorannGame();
	final LorannView lorannView = new LorannView(lorannGame);
	final LorannController lorannController = new LorannController(lorannView, lorannGame);
	lorannView.setController(lorannController);
	lorannController.control();
}
}
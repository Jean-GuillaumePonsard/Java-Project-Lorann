package view;


import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.ILorannController;
import contract.ILorannGame;
import contract.ILorannView;
import contract.IView;

/**
 * The Class View.
 *
 * @author Franz Alliod
 */
public class LorannView implements Runnable, ILorannView {

	/** The frame. */
	private final LorannViewFrame LorannviewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public LorannView(final ILorannGame lorannGame) {
		this.LorannviewFrame = new LorannViewFrame(lorannGame, "Lorann");
		
		}
	/**
	 * Method to perform Order when a key is pressed
	 *
	 * @param keyCode
	 *          the key code
	 */
	
	
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) 
	{
		
	
		switch (keyCode) 
		{
			case KeyEvent.VK_UP: case KeyEvent.VK_Z:
				return ControllerOrder.UP;
								
			case KeyEvent.VK_DOWN: case KeyEvent.VK_S:
				return ControllerOrder.DOWN;
				
			case KeyEvent.VK_LEFT: case KeyEvent.VK_Q:
				return ControllerOrder.LEFT;
				
			case KeyEvent.VK_RIGHT: case KeyEvent.VK_D:
				return ControllerOrder.RIGHT;
				
				
			case KeyEvent.VK_SPACE:
				return ControllerOrder.LAUNCHSPELL;
		}
		return ControllerOrder.VOID;
		
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final ILorannController controller) {
		this.LorannviewFrame.setController(controller);
		}
	/**
	 * Close the frame
	 * @dispose
	 * destroy JFrame object
	 */
	public void run() {
		// TODO Auto-generated method stub
		this.LorannviewFrame.setVisible(true);
	}


	
}

	
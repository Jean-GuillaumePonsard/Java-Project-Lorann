package view;


import java.awt.event.KeyEvent;



import contract.ControllerOrder;
import contract.ILorannController;
import contract.ILorannGame;
import contract.ILorannView;

/**
 * The Class View.
 *
 * @author Franz Alliod
 * @version 16.06.2016
 */
public class LorannView implements Runnable, ILorannView {

	/** The frame. */
	private final LorannViewFrame lorannViewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public LorannView(final ILorannGame lorannGame) {
		this.lorannViewFrame = new LorannViewFrame(lorannGame, "Lorann");
		
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
		this.lorannViewFrame.setController(controller);
		}
	
	/**
	 * Open the Frame
	 * 
	 * It sets the frame visible
	 */
	public void run() {
		// TODO Auto-generated method stub
		this.lorannViewFrame.setVisible(true);
	}


	
}

	
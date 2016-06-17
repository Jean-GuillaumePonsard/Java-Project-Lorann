package view;


import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Franz Alliod
 */
public class LorannView implements IView, Runnable {

	/** The frame. */
	private final LorannViewFrame LorannviewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public LorannView(final IModel model) {
		this.LorannviewFrame = new LorannViewFrame(model);
		SwingUtilities.invokeLater(this);
		}
	/**
	 * Method to perform Order when a key is pressed
	 *
	 * @param keyCode, keyCode2
	 *          the key code
	 */
	
	
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode, final int keyCode2) 
	{
		
	
		switch (keyCode) 
		{
			case KeyEvent.VK_UP:
				switch(keyCode2)
				{
					//case KeyEvent.VK_LEFT: return ControllerOrder.UPPERLEFT;
					//case KeyEvent.VK_RIGHT: return ControllerOrder.UPPERRIGHT;
					default: return ControllerOrder.UP;
				}
			case KeyEvent.VK_DOWN:
				switch(keyCode2)
				{
					//case KeyEvent.VK_LEFT: return ControllerOrder.DOWNLEFT;
					//case KeyEvent.VK_RIGHT: return ControllerOrder.DOWNRIGHT;
					default: return ControllerOrder.DOWN;
				}
			case KeyEvent.VK_LEFT:
				switch(keyCode2)
				{
					//case KeyEvent.VK_UP: return ControllerOrder.UPPERLEFT;
					//case KeyEvent.VK_DOWN: return ControllerOrder.DOWNLEFT;
					default: return ControllerOrder.LEFT;
				}
			case KeyEvent.VK_RIGHT:
				switch(keyCode2)
				{
					//case KeyEvent.VK_UP: return ControllerOrder.UPPERRIGHT;
					//case KeyEvent.VK_DOWN: return ControllerOrder.DOWNRIGHT;
					default: return ControllerOrder.RIGHT;
				}
				
			case KeyEvent.VK_SPACE:
				switch(keyCode2)
				{
					//case KeyEvent.VK_UP: return ControllerOrder.UPPERRIGHT;
					//case KeyEvent.VK_DOWN: return ControllerOrder.DOWNRIGHT;
					default: return ControllerOrder.LAUNCHSPELL;
				}
			}
		return ControllerOrder.VOID;	
		
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.LorannviewFrame.setController(controller);
		}
	/**
	 * Close the frame
	 * @dispose
	 * destroy JFrame object
	 */
	 public void closeFrame() {
	
	 this.LorannviewFrame.setVisible(false);
	 }
	 /**
		 * Launch the frame
		 * set the frame visible
		 * @param true
		 */
	public void runFrame() {
	this.LorannviewFrame.setVisible(true);
		
	}

	public void printMessage(String message) {
		// TODO Auto-generated method stub
		
	}


	public void run() {
		// TODO Auto-generated method stub
		
	} 
		}
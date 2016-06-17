package view;


import javax.swing.SwingUtilities;

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
package view;

import java.awt.event.KeyEvent;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.File;
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
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public LorannView(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
		}

	/**
	 * Launch the frame
	 * set the frame visible
	 * @param true
	 */
	public void openFrame() {
	this.viewFrame.setVisible(true);
		}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
		}
	/**
	 * Close the frame
	 * @dispose
	 * destroy JFrame object
	 */
	 public void closeFrame() {
	
	 this.viewFrame.setVisible(false);
	 } 
/**
 * Draws map
 */
		
	 	public void drawMap()
{
}
}

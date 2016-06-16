package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask.

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;

/**
 * The Class ViewFrame.
 *
 * @author Franz Alliod
 */
class LaurannViewFrame extends JFrame implements KeyListener {

	/** The model. */
	private IModel						model;
	private Timer timer = new Timer(1000,this);

	/** The controller. */
	private IController				controller;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -697358409737458175L;

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @throws HeadlessException
	 *           the headless exception
	 */
	public LorannViewFrame(final IModel model) throws HeadlessException {
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param gc
	 *          the gc
	 */
	public LorannViewFrame(final IModel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param title
	 *          the title
	 * @throws HeadlessException
	 *           the headless exception
	 */
	public LorannViewFrame(final IModel model, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param title
	 *          the title
	 * @param gc
	 *          the gc
	 */
	public LorannViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(model);
	}

	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	private IController getController() {
		return this.controller;
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	protected void setController(final IController controller) {
		this.controller = controller;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	protected IModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Builds the view frame.
	 *
	 * @param model
	 *          the model
	 */
	private void buildViewFrame(final IModel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setContentPane(new LorannViewPanel(this));
		this.setSize(640, 384);
		this.setLocationRelativeTo(null);
	}
	/**
	 * Key code for controller.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	
	public void keyPressed(KeyEvent e) {
        if ((e.getKeyCode() == KeyEvent.VK_UP) && ((e.getModifiers() & KeyEvent.VK_LEFT) != 0)) {
        	return ControllerOrder.UPLEFT; } 
        
    public void keyPressed2(KeyEvent e) {
            if ((e.getKeyCode() == KeyEvent.VK_UP) && ((e.getModifiers() & KeyEvent.VK_RIGHT) != 0)) {
            	return ControllerOrder.UPRIGHT; } }
            
    public void keyPressed3(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_DOWN) && ((e.getModifiers() & KeyEvent.VK_LEFT) != 0)) {
                	return ControllerOrder.DOWNLEFT; } }
                
    public void keyPressed4(KeyEvent e) {
                    if ((e.getKeyCode() == KeyEvent.VK_DOWN) && ((e.getModifiers() & KeyEvent.VK_RIGHT) != 0)) {
                    	return ControllerOrder.DOWNRIGHT; } }	
	
	
	
	
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
			default:
				return ControllerOrder.NOP;
		}
			}		
				}	

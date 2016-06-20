package view;


import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;



import contract.ILorannController;
import contract.ILorannGame;

/**
 * The Class ViewFrame.
 *
 * @author Franz Alliod
 * @version 16.06.2016
 */
class LorannViewFrame extends JFrame implements KeyListener {

	/** The model. */
	
	private ILorannGame						lorranGame;

	/** The controller. */
	
	private ILorannController				controller;
	
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
	public LorannViewFrame(final ILorannGame lorannGame) throws HeadlessException {
		this.buildViewFrame(lorranGame);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param gc
	 *          the gc
	 */
	public LorannViewFrame(final ILorannGame lorannGame, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(lorannGame);
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
	public LorannViewFrame(final ILorannGame lorannGame, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(lorannGame);
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
	public LorannViewFrame(final ILorannGame lorannGame, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(lorannGame);
	}

	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	private ILorannController getController() {
		return this.controller;
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	protected void setController(final ILorannController controller) {
		this.controller = controller;
	}

	/**
	 * Gets the LorannGame.
	 *
	 * @return the lorranGame
	 */
	protected ILorannGame getLorannGame() {
		return this.lorranGame;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final ILorannGame lorannGame) {
		this.lorranGame = lorannGame;
	}

	/**
	 * Builds the view frame.
	 *
	 * @param model
	 *          the model
	 */
	private void buildViewFrame(final ILorannGame lorannGame) {
		this.setModel(lorannGame);
		this.setTitle("Lorran 2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setContentPane(new LorannViewPanel(this));
		this.setSize(648, 420+20);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
		
	
/** Method for KeyActions
 * 
 * 
 * @param Keyevent
 */
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		this.getController().orderPerform(LorannView.keyCodeToControllerOrder(e.getKeyCode()));
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}


    

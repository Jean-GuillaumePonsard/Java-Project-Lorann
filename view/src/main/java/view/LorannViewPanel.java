package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 * @author Franz Alliod
 */
class LorannViewPanel extends JPanel implements Observer {

	/** The view frame. */
	
	private LorannViewFrame					LorannviewFrame;
	private JLabel [][] JLabelMap;
	private GridBagConstraints gbc; 
	
	/** The Constant serialVersionUID. */
	
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param LorannviewFrame
	 *          the view frame
	 */
	public LorannViewPanel(final LorannViewFrame LorannviewFrame) {
		this.setLorannViewFrame(LorannviewFrame);
		this.setSize(this.getLorannViewFrame().getLorannGame().getD());
		this.setPreferredSize(this.getLorannViewFrame().getLorannGame().getD());
		LorannviewFrame.getLorannGame().getObservable().addObserver(this);
		JLabelMap = new JLabel [this.getLorannViewFrame().getLorannGame().getLorannMap().getHeight()][this.getLorannViewFrame().getModel().getWidth()];
		this.gbc = new GridBagConstraints();
		this.setLayout(new GridBagLayout());	
		
		this.initLorannViewPanel();		
	}
	/** Puts elements on ViewPanel
	 * 
	 */
	
	public void initLorannViewPanel()
	{
		int x=0, y=0;
		for(y=0; y<this.getLorannViewFrame().getLorannGame().getHeight(); y++)
		{
			for(x=0; x<this.getLorannViewFrame().getLorannGame().getWidth(); x++)
			{
				JLabel sprite = new JLabel();
				sprite.setIcon(this.getLorannViewFrame().getLorannGame().getImageElement(y, x));
				this.JLabelMap[y][x]=sprite;
				this.getGbc().gridx = x;
				this.getGbc().gridy = y;
				this.getGbc().gridheight = 1;
				this.getGbc().gridwidth = 1;
				this.add(sprite, gbc);	
				// Gridx-Gridy Specifies the row and column of the component ( left to right / up to down )
			}
		}		
		this.getGbc().gridx = 0;
		this.getGbc().gridy++;
		this.getGbc().gridwidth = 5;	
		this.getLorannViewFrame().pack();
		// Pack make the application to be in the preferredSize
		this.setVisible(true);
		this.repaint();
	}
	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private LorannViewFrame getLorannViewFrame() {
		return this.LorannviewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setLorannViewFrame(final LorannViewFrame LorannviewFrame) {
		this.LorannviewFrame = LorannviewFrame;
	}

	/**
	 * Method that change the Observed 
	 * 
	 * @param Observable
	 * The observable object
	 * @param arg1
	 * an Object
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.removeAll();
		this.initLorannViewPanel();
		this.repaint();
	}

	/**
	 * Method that print-modifies components in Frame
	 * 
	 * @param graphics
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
	//	graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
	//	graphics.drawString(this.getViewFrame().getModel().getMessage(), 10, 20);
	}
	/** The JLabelMap
	 * 
	 * @return JLabelMap
	 */
	
	public JLabel[][] getJLabelMap() {
		return JLabelMap;
	}
	/**
	 * Sets the JLabelMap.
	 *
	 * @param JLabel, jLabelMap
	 *          the JLabelMap
	 */
	public void setJLabelMap(JLabel[][] jLabelMap) {
		JLabelMap = jLabelMap;
	}

	
	
/** GridBagConstraints set the location of elements
 * 
 * @return gbc
 */
	
	public GridBagConstraints getGbc() {
		return gbc;
	}
/** Sets the GridBagConstraints
 * 
 * @param gbc
 */
	public void setGbc(GridBagConstraints gbc) {
		this.gbc = gbc;
	} }

	
/* TO DO	
if(this.gameOver == 0)
{
	this.gameOver = 1;	
	dispose()
	this.viewFrame.ScoreDisplay();
		}
*/

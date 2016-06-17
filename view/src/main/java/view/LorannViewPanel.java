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
	 * @param viewFrame
	 *          the view frame
	 */
	public LorannViewPanel(final LorannViewFrame LorannviewFrame) {
		this.setLorannViewFrame(LorannviewFrame);
		this.setSize(this.getLorannViewFrame().getModel().getD());
		this.setPreferredSize(this.getLorannViewFrame().getModel().getD());
		LorannviewFrame.getModel().getObservable().addObserver(this);
		JLabelMap = new JLabel [this.getLorannViewFrame().getModel().getDimensionMapY()][this.getLorannViewFrame().getModel().getDimensionMapY()];
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
		for(y=0; y<this.getLorannViewFrame().getModel().getDimensionMapY(); y++)
		{
			for(x=0; x<this.getLorannViewFrame().getModel().getDimensionMapY(); x++)
			{
				JLabel sprite = new JLabel();
				sprite.setIcon(this.getLorannViewFrame().getModel().getImageElement(y, x));
				this.JLabelMap[y][x]=sprite;
				this.getGbc().gridx = x;
				this.getGbc().gridy = y;
				this.getGbc().gridheight = 1;
				this.getGbc().gridwidth = 1;
				this.add(sprite, gbc);	
			}
		}		
		this.getGbc().gridx = 0;
		this.getGbc().gridy++;
		this.getGbc().gridwidth = 5;	
		this.getLorannViewFrame().pack();
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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.removeAll();
		this.initLorannViewPanel();
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
	//	graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
	//	graphics.drawString(this.getViewFrame().getModel().getMessage(), 10, 20);
	}
	public JLabel[][] getJLabelMap() {
		return JLabelMap;
	}

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

package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import contract.IElement;
import contract.IMonster;

/**
 * The Class ViewPanel.
 *
 * @author Franz Alliod
 */
class LorannViewPanel extends JPanel implements Observer {

	/** The view frame. */
	
	private LorannViewFrame					LorannviewFrame;
	private JLabel [][] JLabelMap;
	
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
		//this.setSize(this.getLorannViewFrame().getLorannGame().getLorannMap().getWidth()*32, this.getLorannViewFrame().getLorannGame().getLorannMap().getHeight()*32);
		//this.setPreferredSize(this.getLorannViewFrame().getLorannGame().getD());
		//LorannviewFrame.getLorannGame().addObserver(this);
		//JLabelMap = new JLabel [this.getLorannViewFrame().getLorannGame().getLorannMap().getHeight()][this.getLorannViewFrame().getLorannGame().getLorannMap().getWidth()];
		
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
		this.repaint();
	}


	/**
	 * Method that print components in Frame
	 * 
	 * @param graphics
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		
		int x = 0;

		
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		for(IElement[] element: LorannviewFrame.getLorannGame().getLorannMap().getElements())
		{
			int y = 0;
			for(IElement e:element)
			{
				if(e!=null) {
					graphics.drawImage(e.getImage(), x * 32 + 1, y * 32 + 1, null);
				}
				y++;
			}
			x++;
		}
		
		for(IMonster monster : LorannviewFrame.getLorannGame().getLorannMap().getMonsters())
		{
			graphics.drawImage(((IElement)monster).getImage(), ((IElement)monster).getX()*32, ((IElement)monster).getY()*32, null);
		}
		
		IElement lorann = LorannviewFrame.getLorannGame().getLorannMap().getLorann();
		graphics.drawImage(lorann.getImage(), lorann.getX()*32, lorann.getY()*32, null);
	}
	
		}

	
/* TO DO	
if(this.gameOver == 0)
{
	this.gameOver = 1;	
	dispose()
	this.viewFrame.ScoreDisplay();
		}
*/

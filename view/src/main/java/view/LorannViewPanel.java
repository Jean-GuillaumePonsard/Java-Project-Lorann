package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import contract.IElement;
import contract.ILorann;
import contract.IMonster;
import contract.ISpell;
import contract.SpellStatement;

/**
 * The Class ViewPanel.
 *
 * @author Franz Alliod
 */
class LorannViewPanel extends JPanel implements Observer {

	/** The view frame. */
	
	private LorannViewFrame					LorannviewFrame;
	
	/** The Constant serialVersionUID. */
	
	private static final long	serialVersionUID	= -998294702363713521L;
	
	/** The font */
	private Font font;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param LorannviewFrame
	 *          the view frame
	 */
	public LorannViewPanel(final LorannViewFrame LorannviewFrame) {
		this.setLorannViewFrame(LorannviewFrame);
		
		LorannviewFrame.getLorannGame().getObservable().addObserver(this);
		LorannviewFrame.getLorannGame().getLorannMap().getObservable().addObserver(this);
		LorannviewFrame.getLorannGame().getLorannMap().getLorann().getObservable().addObserver(this);
		LorannviewFrame.getLorannGame().getLorannMap().getLorannSpell().getObservable().addObserver(this);
		
		this.font = new Font("Courrier", Font.BOLD, 20);
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
		
		//Draw elements
		
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
		
		//Draw monsters
		
		for(IMonster monster : LorannviewFrame.getLorannGame().getLorannMap().getMonsters())
		{
			graphics.drawImage(((IElement)monster).getImage(), ((IElement)monster).getX()*32, ((IElement)monster).getY()*32, null);
		}
		
		
		//Draw Lorann's spell if launched
		
		IElement spell = LorannviewFrame.getLorannGame().getLorannMap().getLorannSpell();
		if(((ISpell)spell).getSpellStatement() != SpellStatement.INPOCKET)
		{
			switch(((ISpell)spell).getSpellColor())
			{
			case BLUE:
				spell.setImage("sprite/fireball_2.png");
				break;
			case GREEN:
				spell.setImage("sprite/fireball_1.png");
				break;
			case PINK:
				spell.setImage("sprite/fireball_3.png");
				break;
			case RED:
				spell.setImage("sprite/fireball_4.png");
				break;
			case YELLOW:
				spell.setImage("sprite/fireball_5.png");
				break;
			default:
				spell.setImage("sprite/fireball_1.png");
				break;
	
			}
			graphics.drawImage(spell.getImage(), spell.getX()*32, spell.getY()*32, null);
		}
		
		//Draw Lorann
		
		IElement lorann = LorannviewFrame.getLorannGame().getLorannMap().getLorann();
		graphics.drawImage(lorann.getImage(), lorann.getX()*32, lorann.getY()*32, null);
		
		//Display Score
		
		graphics.setFont(font);
		graphics.setColor(Color.CYAN);
		String playerScore = "SCORE :"+((ILorann)lorann).getScore();
		graphics.drawString(playerScore, 10, 400);
		
	}
	
}
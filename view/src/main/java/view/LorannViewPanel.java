package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

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
 * @version 16.06.2016
 */
class LorannViewPanel extends JPanel implements Observer {

	/** The view frame. */
	
	private LorannViewFrame					lorannViewFrame;
	
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
	public LorannViewPanel(final LorannViewFrame lorannViewFrame) {
		this.setLorannViewFrame(lorannViewFrame);
		
		lorannViewFrame.getLorannGame().getObservable().addObserver(this);
		lorannViewFrame.getLorannGame().getLorannMap().getObservable().addObserver(this);
		lorannViewFrame.getLorannGame().getLorannMap().getLorann().getObservable().addObserver(this);
		lorannViewFrame.getLorannGame().getLorannMap().getLorannSpell().getObservable().addObserver(this);
		
		this.font = new Font("Courrier", Font.BOLD, 20);
		this.repaint();		
	}
	
	/**
	 * Gets the Lorann View frame.
	 *
	 * @return the lorann view frame
	 */
	private LorannViewFrame getLorannViewFrame() {
		return this.lorannViewFrame;
	}

	/**
	 * Sets the Lorann view frame.
	 *
	 * @param viewFrame
	 *          the new lorann view frame
	 */
	private void setLorannViewFrame(final LorannViewFrame lorannViewFrame) {
		this.lorannViewFrame = lorannViewFrame;
	}

	/**
	 * Method that change the Observed 
	 * 
	 * @param Observable
	 * The observable object
	 * 
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
		
		for(IElement[] element: lorannViewFrame.getLorannGame().getLorannMap().getElements())
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
		
		for(IMonster monster : lorannViewFrame.getLorannGame().getLorannMap().getMonsters())
		{
			graphics.drawImage(((IElement)monster).getImage(), ((IElement)monster).getX()*32, ((IElement)monster).getY()*32, null);
		}
		
		
		//Draw Lorann's spell if launched
		
		IElement spell = lorannViewFrame.getLorannGame().getLorannMap().getLorannSpell();
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
		
		IElement lorann = lorannViewFrame.getLorannGame().getLorannMap().getLorann();
		graphics.drawImage(lorann.getImage(), lorann.getX()*32, lorann.getY()*32, null);
		
		//Display Score
		
		graphics.setFont(font);
		graphics.setColor(Color.CYAN);
		String playerScore = "SCORE :"+((ILorann)lorann).getScore();
		graphics.drawString(playerScore, 10, 400);
		
	}
	
}
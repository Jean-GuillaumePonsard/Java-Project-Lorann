package model;

import contract.ISpell;
import contract.Permeability;
import contract.SpellColor;
import contract.SpellStatement;

/**
 * The Class Spell.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class Spell extends MotionElement implements ISpell {

	/** The SpellStatement of the Spell */
	private SpellStatement spellStatement;
	
	/** The Spell color */
	private SpellColor spellColor;
	
	/** 
	 *	Instantiates a new spell.
	 * 
	 * @param x
	 * 	The x position of the spell
	 * @param y
	 * 	The y position of the spell
	 * @param url
	 * 	The path of the image
	 */
	
	public Spell(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
		this.spellStatement = SpellStatement.INPOCKET;
		this.setSpellColor(SpellColor.GREEN);
	}
	
	/* (non-Javadoc)
	 * @see model.ISpell#getSpellStatement()
	 */
	
	public SpellStatement getSpellStatement()
	{
		return this.spellStatement;
	}
	
	/* (non-Javadoc)
	 * @see model.ISpell#setSpellStatement(model.SpellStatement)
	 */
	
	public void setSpellStatement(SpellStatement spellStatement)
	{
		this.spellStatement = spellStatement;
		modelChanged();
	}

	/*
	 * (non-Javadoc)
	 * @see contract.ISpell#getSpellColor()
	 */
	public SpellColor getSpellColor() {
		return this.spellColor;
	}

	/*
	 * (non-Javadoc)
	 * @see contract.ISpell#setSpellColor(contract.SpellColor)
	 */
	public void setSpellColor(SpellColor spellColor) {
		this.spellColor = spellColor;
		modelChanged();
	}
	
	/*
	 * (non-Javadoc)
	 * @see contract.ISpell#setNextColor()
	 */
	public void setNextColor()
	{
		switch(spellColor)
		{
		case BLUE:
			setSpellColor(SpellColor.PINK);
			break;
		case GREEN:
			setSpellColor(SpellColor.BLUE);
			break;
		case PINK:
			setSpellColor(SpellColor.RED);
			break;
		case RED:
			setSpellColor(SpellColor.YELLOW);
			break;
		case YELLOW:
			setSpellColor(SpellColor.GREEN);
			break;
		
		}
		modelChanged();
	}
}

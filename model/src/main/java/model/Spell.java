package model;

import contract.ISpell;
import contract.Permeability;
import contract.SpellStatement;

/**
 * The Class Spell.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Spell extends MotionElement implements ISpell {

	/** The SpellStatement of the Spell */
	private SpellStatement spellStatement;
	
	/** 
	 *	Instantiates a new spell.
	 * 
	 * @param x
	 * @param y
	 * @param url
	 */
	
	public Spell(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
		this.spellStatement = SpellStatement.INPOCKET;
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
	}
}

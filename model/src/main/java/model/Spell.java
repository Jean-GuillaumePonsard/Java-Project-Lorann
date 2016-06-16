package model;

/**
 * The Class Spell.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Spell extends MotionElement {

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
	
	/**
	 * Sets the spellStatement.
	 *
	 * @return spellStatement
	 */
	
	public SpellStatement getSpellStatement()
	{
		return this.spellStatement;
	}
	
	/**
	 * Sets the spellStatement.
	 *
	 * @param spellStatement
	 *          the new spellStatement
	 */
	
	public void setSpellStatement(SpellStatement spellStatement)
	{
		this.spellStatement = spellStatement;
	}
}

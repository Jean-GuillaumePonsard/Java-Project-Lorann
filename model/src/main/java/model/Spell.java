package model;

public class Spell extends MotionElement {

	private SpellStatement spellStatement;
	
	public Spell(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		/*setX(x);
		  setY(y);*/
	}
	
	public SpellStatement getSpellStatement()
	{
		return this.spellStatement;
	}
	
	public void setSpellStatement(SpellStatement spellStatement)
	{
		this.spellStatement = spellStatement;
	}
}

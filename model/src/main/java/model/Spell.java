package model;

public class Spell extends MotionElement {

	private SpellStatement spellStatement;
	
	public Spell(int x, int y, String url)
	{
		//super(url, permability.PENETRABLE)
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

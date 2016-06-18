package contract;

public interface ISpell {

	/**
	 * Sets the spellStatement.
	 *
	 * @return spellStatement
	 */

	SpellStatement getSpellStatement();

	/**
	 * Sets the spellStatement.
	 *
	 * @param spellStatement
	 *          the new spellStatement
	 */

	void setSpellStatement(SpellStatement spellStatement);

	/**
	 * Gets the spellColor
	 * 
	 * @return SpellColor
	 */
	SpellColor getSpellColor();
	
	/**
	 * Sets spellColor
	 * 
	 * @param spellColor
	 */			
	
	void setSpellColor(SpellColor spellColor);
	
	/**
	 * Sets nextColor
	 * 
	 * 
	 */		
	
	void setNextColor();
	
}
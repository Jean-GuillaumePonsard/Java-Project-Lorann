package contract;

/**
 * The interface ISpell
 * 
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

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
	 * 	The new color of the spell
	 */			
	
	void setSpellColor(SpellColor spellColor);
	
	/**
	 * Sets nextColor. Change color of the spell
	 * 
	 * 
	 */		
	
	void setNextColor();
	
}
package model;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.ISpell;
import contract.SpellStatement;

/**
 * The Class TestSpell.
 *
 * @author Adrien Thevenet alias chaospreader
 */
public class TestSpell {

	/**
	 * Test method for {@link model.Spell#Spell(int, int, String)}
	 * with a random image url taken on the Internet
	 */
	@Test
	public void testSpell() {
		assertNotNull(new model.Spell(0, 0, "exia.png"));
	}

	/**
	 * Test method for {@link model.Spell#getSpellStatement()}
	 */
	@Test
	public void testGetSpellStatement() {
		ISpell spell = new model.Spell(0, 0, "exia.png");
		assertEquals(SpellStatement.INPOCKET, spell.getSpellStatement());
	}
	/**
	 * Test method for {@link model.Spell#setSpellStatement(SpellStatement)}
	 */
	@Test
	public void testSetSpellStatement() {
		ISpell spell = new model.Spell(0, 0, "exia.png");
		spell.setSpellStatement(SpellStatement.LAUNCHEDDOWN);
		assertEquals(SpellStatement.LAUNCHEDDOWN, spell.getSpellStatement());
	}

}

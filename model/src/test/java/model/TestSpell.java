package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ISpell;
import contract.SpellStatement;

/**
 * The Class TestSpell.
 *
 * @author Adrien Thevenet
 */
public class TestSpell {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test method for {@link model.Spell#Spell(int, int, String)}
	 * whit an image of exia
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

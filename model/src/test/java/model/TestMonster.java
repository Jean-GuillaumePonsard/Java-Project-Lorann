package model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The Class TestMonster.
 *
 * @author Adrien Thevenet alias chaospreader
 */
public class TestMonster {

	/**
	 * Test method for {@link model.Monster#Monster(int, int, String)}
	 * with a random image url taken on the Internet
	 */
	@Test
	public void testMonster() {
	assertNotNull(new model.Monster(0, 0, "exia.png"));
	}

}

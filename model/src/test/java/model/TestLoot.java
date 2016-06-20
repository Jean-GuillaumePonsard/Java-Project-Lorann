package model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The class TestLoot
 * 
 * @author Adrien Thevenet alias chaospreader
 *
 */
public class TestLoot {

	/**
	 * test method for {@link model.Loot#Loot(int, int, String)}
	 */
	@Test
	public void testLoot() {
		assertNotNull(new model.Loot(0, 0, "exia.png", 0));
		}

}

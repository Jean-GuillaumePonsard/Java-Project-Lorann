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
		assertNotNull(new model.Loot(0, 0, "https://www.alderac.com/loveletter/files/2014/05/Loot.jpg"));
		}

}

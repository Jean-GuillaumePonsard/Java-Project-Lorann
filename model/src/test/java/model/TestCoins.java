package model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The Class TestCoins.
 *
 * @author Adrien Thevenet alias chaospreader
 */
public class TestCoins {
	
/**
 * Test method for {@link model.Coins#Coins(int, int, String)}
 * whit a random image url taken on the Internet
 */
	@Test
	public void testCoins() {
		assertNotNull(new model.Coins(0, 0,"exia.png"));
	}

}

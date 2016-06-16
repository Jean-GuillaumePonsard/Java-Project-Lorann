package model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The Class TestCrytalBublle.
 *
 * @author Adrien Thevenet alias chaospreader
 */
public class TestCrystalBubble {

	/**
	 * test method for {@link model.CrystalBubble#CrystalBubble(int, int, String)}
	 * whit a random image url taken on the Internet
	 */
	@Test
	public void testCrystalBubble() {
		assertNotNull(new model.CrystalBubble(0, 0,"http://pre07.deviantart.net/b82e/th/pre/i/2010/131/d/b/energy_ball_by_bunny177.jpg"));
	}

}

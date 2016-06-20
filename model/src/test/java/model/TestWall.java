package model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The Class TestWall.
 *
 * @author Adrien Thevenet alias chaospreader
 */
public class TestWall {

	/**
	 * Test method for {@link model.Wall#Wall(int, int, String)}
	 * whit a random image url taken on the Internet
	 */
	@Test
	public void testWall() {
		assertNotNull(new model.Wall(0, 0,"exia.png"));
	}

}

package model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The class TestFloor
 *  
 * @author Adrien Thevenet alias chaospreader
 *
 */
public class TestFloor {

	/**
	 * test method for {@link model.Floor#Floor(int, int, String)}
	 * whit a random image url taken on the Internet
	 */
	@Test
	public final void testFloor() {
		assertNotNull(new model.Wall(0, 0,"exia.png"));
	}

}

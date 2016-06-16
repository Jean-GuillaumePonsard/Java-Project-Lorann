package model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * the class TestLorann
 * 
 * @author Adrien Thevenet alias chaospreader
 *
 */
public class TestLorann {

	/**
	 * test method for {@link model.Lorann#Lorann(int, int, String)}
	 * whit a random image url taken onthe Internet
	 */
	@Test
	public void testLorann() {
		assertNotNull(new model.Lorann(0, 0, "https://game-guide.fr/wp-content/uploads/2015/08/Marvel_Heroes_Livestream_PAXPrime-21.jpg"));	
	}

	/**
	 * test method for {@link model.Lorann#getLorannStatement()}
	 */
	@Test
	public void testGetLorannStatement() {
		model.Lorann lorann = new model.Lorann(0, 0, "https://game-guide.fr/wp-content/uploads/2015/08/Marvel_Heroes_Livestream_PAXPrime-21.jpg");
		assertEquals(LorannStatement.UP, lorann.getLorannStatement());
	}

	/**
	 * test method for {@link model.Lorann#setLorannStatement(LorannStatement)}
	 */
	@Test
	public void testSetLorannStatement() {
		model.Lorann lorann = new model.Lorann(0, 0, "https://game-guide.fr/wp-content/uploads/2015/08/Marvel_Heroes_Livestream_PAXPrime-21.jpg");
		lorann.setLorannStatement(LorannStatement.DOWN);
		assertEquals(LorannStatement.DOWN, lorann.getLorannStatement());
	}

}

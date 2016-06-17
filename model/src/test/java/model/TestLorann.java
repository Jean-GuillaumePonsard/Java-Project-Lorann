package model;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.ILorann;
import contract.LorannStatement;

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
		ILorann lorann = new model.Lorann(0, 0, "https://game-guide.fr/wp-content/uploads/2015/08/Marvel_Heroes_Livestream_PAXPrime-21.jpg");
		assertEquals(LorannStatement.UP, lorann.getLorannStatement());
	}

	/**
	 * test method for {@link model.Lorann#setLorannStatement(LorannStatement)}
	 */
	@Test
	public void testSetLorannStatement() {
		ILorann lorann = new model.Lorann(0, 0, "https://game-guide.fr/wp-content/uploads/2015/08/Marvel_Heroes_Livestream_PAXPrime-21.jpg");
		lorann.setLorannStatement(LorannStatement.DOWN);
		assertEquals(LorannStatement.DOWN, lorann.getLorannStatement());
	}

}

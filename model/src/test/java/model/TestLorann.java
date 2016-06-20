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
		assertNotNull(new model.Lorann(0, 0, "exia.png"));	
	}

	/**
	 * test method for {@link model.Lorann#getLorannStatement()}
	 */
	@Test
	public void testGetLorannStatement() {
		ILorann lorann = new model.Lorann(0, 0, "exia.png");
		assertEquals(LorannStatement.UP, lorann.getLorannStatement());
	}

	/**
	 * test method for {@link model.Lorann#setLorannStatement(LorannStatement)}
	 */
	@Test
	public void testSetLorannStatement() {
		ILorann lorann = new model.Lorann(0, 0, "exia.png");
		lorann.setLorannStatement(LorannStatement.DOWN);
		assertEquals(LorannStatement.DOWN, lorann.getLorannStatement());
	}

}

package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ILorann;
import contract.LorannStatement;

/**
 * the class TestLorann
 * 
 * @author Adrien Thevenet 
 *
 */
public class TestLorann {
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * test method for {@link model.Lorann#Lorann(int, int, String)}
	 * whit a n image of exia
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

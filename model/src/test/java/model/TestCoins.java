package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The Class TestCoins.
 *
 * @author Adrien Thevenet
 */
public class TestCoins {
	
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
 * Test method for {@link model.Coins#Coins(int, int, String)}
 * whit an image of exia
 */
	@Test
	public void testCoins() {
		assertNotNull(new model.Coins(0, 0,"exia.png"));
	}

}

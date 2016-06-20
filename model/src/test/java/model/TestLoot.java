package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class TestLoot
 * 
 * @author Adrien Thevenet
 *
 */
public class TestLoot {

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
	 * test method for {@link model.Loot#Loot(int, int, String)}
	 * with an image od exia
	 */
	@Test
	public void testLoot() {
		assertNotNull(new model.Loot(0, 0, "exia.png", 0));
		}

}

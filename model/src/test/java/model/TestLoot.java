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
 *@version 16.06.2016
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
	 * test method for {@link model.Loot#Loot(int, int, String, int)}
	 * with an image of exia
	 */
	@Test
	public void testLoot() {
		assertNotNull(new model.Loot(0, 0, "exia.png", 0));
		}

}

package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The Class TestMonster.
 *
 * @author Adrien Thevenet alias chaospreader
 */
public class TestMonster {

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
	 * Test method for {@link model.Monster#Monster(int, int, String)}
	 * with a image of exia
	 */
	@Test
	public void testMonster() {
	assertNotNull(new model.Monster(0, 0, "exia.png"));
	}

}

package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class TestFloor
 *  
 * @author Adrien Thevenet
 *@version 16.06.2016
 */
public class TestFloor {

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
	 * test method for {@link model.Floor#Floor(int, int, String)}
	 * whit an image of exia
	 */
	@Test
	public final void testFloor() {
		assertNotNull(new model.Wall(0, 0,"exia.png"));
	}

}

package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.Permeability;
/**
 * The Class TestMotionElement.
 * 
 * @author Adrien Thevenet
 *@version 16.06.2016
 */
public class TestMotionElement {

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
	 * test method for {@link model.MotionElement#MotionElement(String, Permeability)}
	 * whit an image of exia
	 */
	@Test
	public void testMotionElement() {
		assertNotNull(new model.MotionElement("exia.png", Permeability.PENETRABLE));
	}

}

package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test Class TestTicks
 * 
 * @author Adrien Thevenet
 * @version 16.06.2016
 *
 */
public class TestTick {
	
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
	 * test method for {@link controller.Ticks#Ticks(contract.ILorannController)}
	 */
	@Test
	public void testTicks() {
		LorannController i = null;
		assertNotNull(new Ticks(i));
	}
	/**
	 * test method for {@link controller.Ticks#run()}
	 */
	@Test
	public void testRun() {
		LorannController i = null;
		Ticks t = new Ticks(i);
		t.run();
	}

}

package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.GateStatement;
import contract.IDoor;

/**
 * The Class TestDoor.
 *
 * @author Adrien Thevenet
 */
public class TestDoor {
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
	 * Test method for {@link model.Door#Door(int, int, String)}
	 * with an image of exia
	 */
	@Test
	public void testDoor() {
		assertNotNull(new model.Wall(0, 0,"exia.png"));
	}

	/**
	 * Test method for {@link model.Door#setGateStatement(GateStatement)}
	 */
	@Test
	public void testSetGateStatement() {
		IDoor door = new model.Door(0, 0,"exia.png");
		door.setGateStatement(GateStatement.OPEN);
		assertEquals(GateStatement.OPEN, door.getGateStatement());
	}
	/**
	 * Test method for {@link model.Door#getGateStatement()}
	 */
	@Test
	public void testGetGateStatement() {
		IDoor door = new model.Door(0, 0,"exia.png");
		assertEquals(GateStatement.LOCK, door.getGateStatement());
	}

}

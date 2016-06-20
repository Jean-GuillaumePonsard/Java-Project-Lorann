package model;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.GateStatement;
import contract.IDoor;

/**
 * The Class TestDoor.
 *
 * @author Adrien Thevenet alias chaospreader
 */
public class TestDoor {

	/**
	 * Test method for {@link model.Door#Door(int, int, String)}
	 * with a random image url taken on the Internet
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

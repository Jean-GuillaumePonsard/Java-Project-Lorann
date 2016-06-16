package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDoor {

	@Test
	public void testDoor() {
		assertNotNull(new model.Wall(0, 0,"http://www.doorsonline.co/images/accessories/Wood_Door-Liner_skirting.jpg"));
	}

	@Test
	public void testSetGateStatement() {
		model.Door door = new model.Door(0, 0,"http://www.doorsonline.co/images/accessories/Wood_Door-Liner_skirting.jpg");
		door.setGateStatement(GateStatement.OPEN);
		assertEquals(GateStatement.OPEN, door.getGateStatement());
	}

	@Test
	public void testGetGateStatement() {
		model.Door door = new model.Door(0, 0,"http://www.doorsonline.co/images/accessories/Wood_Door-Liner_skirting.jpg");
		assertEquals(GateStatement.LOCK, door.getGateStatement());
	}

}

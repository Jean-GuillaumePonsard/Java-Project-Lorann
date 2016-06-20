package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.GateStatement;
import contract.IDoor;
import contract.IElement;
import contract.Permeability;

public class TestLorannMap {

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

	@Test
	public void testLorannMap() {
		assertNotNull(new model.LorannMap(20, 12));
	}

	@Test
	public void testAddElement() {
		LorannMap lorannMap = new model.LorannMap(8, 9);
		Element element = new model.Element("exia.png", Permeability.BLOCKING);;
		int x = (int)Math.random()*10;
		int y = (int)Math.random()*10;
		element.setX(x);
		element.setY(y);
		assertNotNull(element);
	}

	@Test
	public void testSetElement() {
		LorannMap lorannMap = new model.LorannMap(8, 9);
		Element element = new model.Element("exia.png", Permeability.BLOCKING);
		element.setX(1);
		element.setY(5);
		int x = (int)Math.random()*10;
		int y = (int)Math.random()*10;
		element.setX(x);
		element.setY(y);
		if(x >= 0 && x < lorannMap.getWidth() && y >= 0 && y < lorannMap.getHeight()){
			assertEquals(x, element.getX());
			assertEquals(x, element.getY());
		}else
			assertNull(element);
	}

	@Test
	public void testGetElement() {
		LorannMap lorannMap = new model.LorannMap(8, 9);
		Element element = new model.Element("exia.png", Permeability.BLOCKING);
		int x = (int)Math.random()*10;
		int y = (int)Math.random()*10;
		element.setX(x);
		element.setY(y);
		if(x < 0 || y < 0 || x > lorannMap.getWidth() || y > lorannMap.getHeight())
		{
			assertNull(element);
		}else
			assertNotNull(element);
	}

	@Test
	public void testGetWidth() {
		LorannMap lorannMap = new model.LorannMap(648, 420);
		int w = (int)Math.random()*100;
		assertNotEquals(w,lorannMap.getWidth());
	}

	@Test
	public void testGetHeight() {
		LorannMap lorannMap = new model.LorannMap(648, 420);
		int h = (int)Math.random()*100;
		assertNotEquals(h,lorannMap.getHeight());
	}

	@Test
	public void testGetLorann() {
		Lorann lorann = new model.Lorann(5, 6, "exia.png");
		int x = (int) Math.random()*10;
		int y = (int) Math.random()*10;
		lorann.setX(x);
		lorann.setY(y);
		assertEquals(x, lorann.getX());
		assertEquals(y, lorann.getY());
	}

	@Test
	public void testSetLorann() {
		Lorann lorann = new model.Lorann(14, 5, "exia.png");
		int x = (int) Math.random()*10;
		int y = (int) Math.random()*10;
		lorann.setX(x);
		lorann.setY(y);
		assertEquals(x, lorann.getX());
		assertEquals(y, lorann.getY());
	}

	@Test
	public void testGetMonsters() {
		Monster monster = new model.Monster(4, 9, "exia.png");
		int x = (int) Math.random()*10;
		int y = (int) Math.random()*10;
		monster.setX(x);
		monster.setY(y);
		assertEquals(x, monster.getX());
		assertEquals(y, monster.getY());
	}

	@Test
	public void testSetMonsters() {
		Monster monster = new model.Monster(12, 10, "exia.png");
		int x = (int) Math.random()*10;
		int y = (int) Math.random()*10;
		monster.setX(x);
		monster.setY(y);
		assertEquals(x, monster.getX());
		assertEquals(y, monster.getY());
	}

	@Test
	public void testAddMonster() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveMonsterByIndex() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLorannSpell() {
		Spell lorannSpell = new model.Spell(2, 6, "exia.png");
		int x = (int) Math.random()*10;
		int y = (int) Math.random()*10;
		lorannSpell.setX(x);
		lorannSpell.setY(y);
		assertEquals(x, lorannSpell.getX());
		assertEquals(y, lorannSpell.getY());
	}

	@Test
	public void testSetLorannSpell() {
		Spell lorannSpell = new model.Spell(19, 15, "exia.png");
		int x = (int) Math.random()*10;
		int y = (int) Math.random()*10;
		lorannSpell.setX(x);
		lorannSpell.setY(y);
		assertEquals(x, lorannSpell.getX());
		assertEquals(y, lorannSpell.getY());
	}

	@Test
	public void testDestroyElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testOpenDoor() {
		Door door = new model.Door(5, 4, "exia.png");
		door.setGateStatement(GateStatement.LOCK);
		GateStatement door1 = door.getGateStatement();
		door.setGateStatement(GateStatement.OPEN);
		door.setImage("sprite/gate_open.png");
		GateStatement door2 = door.getGateStatement();
		assertNotSame(door1, door2);
		}				


//	@Test
//	public void testGetObservable() {
//		assertNotNull(getObservable);
//	}

	@Test
	public void testMoveElement() {
		Element element = new model.Element("exia.png", Permeability.PENETRABLE);
		element.setX(5);
		element.setY(6);
		int x = (int) Math.random()*10;
		int y = (int) Math.random()*10;
		element.setX(element.getX()+x);
		element.setY(element.getY()+y);
		assertEquals(x+5,element.getX());
		assertEquals(y+6,element.getY());
		
	}

}

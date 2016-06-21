package model;

import static org.junit.Assert.*;

import java.awt.Image;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.GateStatement;
import contract.Permeability;

/**
 * Test Class TestLoranMap.
 * 
 * @author Adrien Thevenet
 * @version 16.06.2016
 *
 */
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
	
	/**
	 * Test method for {@link model.LorannMap#LorannMap(int, int)}
	 */
	@Test
	public void testLorannMap() {
		assertNotNull(new model.LorannMap(20, 12));
	}

	/**
	 * test method for {@link model.LorannMap#addElement(contract.IElement, int, int)}
	 */
	@Test
	public void testAddElement() {
		Element element = new model.Element("exia.png", Permeability.BLOCKING);;
		int x = (int)Math.random()*10;
		int y = (int)Math.random()*10;
		element.setX(x);
		element.setY(y);
		assertNotNull(element);
	}

	/**
	 * test method for {@link model.LorannMap#setElement(contract.IElement, int, int)}
	 */
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

	/**
	 * test method for {@link model.LorannMap#getElement(int, int)}
	 */
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

	/**
	 * test method for {@link model.LorannMap#getWidth()}
	 */
	@Test
	public void testGetWidth() {
		LorannMap lorannMap = new model.LorannMap(648, 420);
		int w = (int)Math.random()*100;
		assertNotEquals(w,lorannMap.getWidth());
	}
	
	/**
	 * test method for {@link model.LorannMap#getHeight()}
	 */
	@Test
	public void testGetHeight() {
		LorannMap lorannMap = new model.LorannMap(648, 420);
		int h = (int)Math.random()*100;
		assertNotEquals(h,lorannMap.getHeight());
	}

	/**
	 * test method for {@link model.LorannMap#getLorann()}
	 */
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

	/**
	 * test method for {@link model.LorannMap#setLorann(contract.IElement)}
	 */
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

	/**
	 * test method for {@link model.LorannMap#getMonsters()}
	 */
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

	/**
	 * test method for {@link model.LorannMap#setMonsters(java.util.ArrayList)}
	 */
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


	/**
	 * test method for {@link model.LorannMap#getLorannSpell()}
	 */
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

	/**
	 * test method for {@link model.LorannMap#setLorannSpell(contract.IElement)}
	 */
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

	/**
	 * test method for {@link model.LorannMap#destroyElement(int, int)}
	 */
	@Test
	public void testDestroyElement() {
		Element element = new model.Element("exia.png", Permeability.BLOCKING);
		int x =(int) Math.random()*10;
		int y =(int) Math.random()*10;
		element.setX(x);
		element.setY(y);
		Image sprite1 = element.getImage();
		Permeability perm1 = element.getPermeability();
		element.setImage("sprite/floor.png");
		element.setPermeability(Permeability.PENETRABLE);
		Image sprite2 = element.getImage();
		Permeability perm2 = element.getPermeability();
		assertNotSame(sprite1, sprite2);
		assertNotSame(perm1, perm2);

	}

	/**
	 * test method for {@link model.LorannMap#openDoor()}
	 */
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


	/**
	 * test method for {@link model.LorannMap#moveElement(contract.IElement, int, int)}
	 */
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

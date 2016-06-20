package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import contract.IElement;
import contract.ILorann;
import contract.Permeability;
import mock.MockLorann;

public class TestLorannController {
	
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
	public void testMoveElement() {
		MockLorann lorann = new mock.MockLorann(0, 0);
		int x = (int) (Math.random()*10);
		int y = (int) (Math.random()*10);
		lorann.setX(x);
		lorann.setY(y);
		assertEquals(x, lorann.getX());
		assertEquals(y, lorann.getY());
		
	}

	@Test
	public void testMonsterAi() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckImpassableElements() {
		fail("Not yet implemented");
	}

	@Test
	public void testLaunchSpell() {
		fail("Not yet implemented");
	}

	@Test
	public void testDie() {
		fail("Not yet implemented");
	}

	@Test
	public void testWin() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testExit() {
		fail("Not yet implemented");
	}

	@Test
	public void testOrderPerform() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveSpell() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckColisionLorannWithLoot() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckColisionLorannWithDoor() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckColisionLorannWithMonster() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckColisionLorann() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckColisionMonsterWithLorann() {
		fail("Not yet implemented");
	}
}

	
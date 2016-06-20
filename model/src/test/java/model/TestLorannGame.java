package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ILorannMap;
import model.LorannGame;

public class TestLorannGame {

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
	public void testLorannGame() {
		assertNotNull(new LorannGame(1));
	}

	@Test
	public void testGetLorannMap() {
		LorannGame lorannGame = new model.LorannGame(1);
		assertEquals(lorannGame.getLorannMap(), lorannGame.lorannMap);
	}

	@Test
	public void testSetLorannMap() {
		LorannGame lorannGame = new model.LorannGame(1);
		ILorannMap lorannMap = new model.LorannMap(20, 12);
		lorannGame.setLorannMap(lorannMap);
		assertEquals(lorannMap, lorannGame.getLorannMap());
	}

	@Test
	public void testInitLorannMap() {
		LorannGame lorannGame = new model.LorannGame(1);
		ILorannMap lorannMap1 = lorannGame.getLorannMap();
		lorannGame.initLorannMap(3);
		ILorannMap lorannMap2 = lorannGame.getLorannMap();
		assertNotSame(lorannMap1, lorannMap2);
	}
}

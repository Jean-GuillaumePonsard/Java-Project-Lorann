package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import mock.MockCoins;
import mock.MockCrystalBubble;

import mock.MockLorann;
import mock.MockMonster;
import mock.MockSpell;
import mock.MockWall;
/**
 * Test Class LorannController
 * 
 * @author Adrien Thevenet
 *@version 16.06.2016
 */
public class TestLorannController {
	
	
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
		MockMonster monster = new mock.MockMonster(0, 0);
		MockLorann lorann = new mock.MockLorann(5, 6);
		int monsterX = monster.getX();
		int monsterY = monster.getY();
		int targetX = lorann.getX();
		int targetY = lorann.getY();
		double random = Math.random();
		
		if(random <= .4d){
			if(monsterY > targetY){
				monsterY--;
				monster.setY(monsterY);
				
				
			}else if(monsterY < targetY){
				monsterY++;
				monster.setY(monsterY);
				
			}
			assertEquals(monsterY, monster.getY());
		}
		else if(random <= .8d){
			if(monsterX > targetX){
				monsterX--;
				monster.setX(monsterX);
			
			}
			else if(monsterX < targetX){
				monsterX++;
				monster.setX(monsterX);
			
			}
			assertEquals(monsterX, monster.getX());
		}
	}


	@Test
	public void testMoveSpell() {
		double random = Math.random();
		MockSpell spell = new mock.MockSpell(0, 1);
		MockWall wall = new mock.MockWall(1, 2);
		int wallX = wall.getX();
		int wallY = wall.getY();
		int spellX = spell.getX();
		int spellY = spell.getY();
		
		if(random <= .2d){
			if(spellX+1 != wallX){
				spellX++;
				spell.setX(spellX);
			}else{
				spellX--;
				spell.setX(spellX);
			}
		}else if(random <= .4d){
			if(spellX-1 != wallX){
				spellX--;
				spell.setX(spellX);
			}else{
				spellX++;
				spell.setX(spellX);
			}
		}else if(random <= .6d){
			if(spellY+1 != wallY){
				spellY++;
				spell.setY(spellY);
			}else{
				spellY--;
				spell.setY(spellY);
			}
		}else if(random <= .8d){
			if(spellY-1 != wallY){
				spellY--;
				spell.setY(spellY);
			}else{
				spellY++;
				spell.setY(spellY);
			}
		}
		assertEquals(spellX, spell.getX());
		assertEquals(spellY, spell.getY());			
	}

	@Test
	public void testCheckColisionLorannWithLoot() {
		MockCoins coins = new mock.MockCoins(0, 2, 500);
		MockLorann lorann = new mock.MockLorann(1, 2);
		MockCrystalBubble crystalBubble = new mock.MockCrystalBubble(1, 3, 1000);
		int lorannX = lorann.getX();
		int lorannY = lorann.getY();
		int coinsX = coins.getX();
		int coinsY = coins.getY();
		int crystalBubbleX = crystalBubble.getX();
		int crystalBubbleY = crystalBubble.getY();
		
		if(lorannX-1 == coinsX && lorannY == coinsY){
			lorann.addScore(coins.getPointsGiven());
		}else if(lorannX+1 == coinsX && lorannY == coinsY){
			lorann.addScore(coins.getPointsGiven());
		}else if(lorannY-1 == coinsY && lorannX == coinsX){
			lorann.addScore(coins.getPointsGiven());
		}else if(lorannY+1 == coinsY && lorannX == coinsX){
			lorann.addScore(coins.getPointsGiven());
		}
		assertEquals(coins.getPointsGiven(),lorann.getScore());
		
		if(lorannX-1 == crystalBubbleX && lorannY == crystalBubbleY){
			lorann.addScore(crystalBubble.getPointsGiven());
		}else if(lorannX+1 == crystalBubbleX && lorannY == crystalBubbleY){
			lorann.addScore(crystalBubble.getPointsGiven());
		}else if(lorannX == crystalBubbleX && lorannY-1 == crystalBubbleY){
			lorann.addScore(coins.getPointsGiven());
		}else if(lorannX == crystalBubbleX && lorannY+1 == crystalBubbleY){
			lorann.addScore(coins.getPointsGiven());
		}
	assertEquals(crystalBubble.getPointsGiven(),lorann.getScore());
}
}
	
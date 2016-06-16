package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWall {

	@Test
	public void testWall() {
		assertNotNull(new model.Wall(0, 0,"http://www.indianaperth.com/images/Solna_Brick_wall_Stretcher_bond_variation1.jpg"));
	}

}

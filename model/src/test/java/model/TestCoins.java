package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCoins {

	@Test
	public void testCoins() {
		assertNotNull(new model.Coins(0, 0,"http://ecole.district1.nbed.nb.ca/ecole-sainte-anne/files/2011/06/argent-300x221.gif"));
	}

}

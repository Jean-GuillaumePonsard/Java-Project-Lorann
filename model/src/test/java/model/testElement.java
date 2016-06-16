package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class testElement {

	@Test
	public void testElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPermeability() {
       double rand = Math.random();
        if (rand < 0.5){
        	model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.PENETRABLE);
        	assertEquals(Permeability.PENETRABLE, element.getPermeability());
        }
        else{
        	model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
        	assertEquals(Permeability.BLOCKING, element.getPermeability());
        }
	}

	@Test
	public void testSetPermeability() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSprite() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSprite() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetX() {
        model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
        int x = (int)(Math.random()*10);
        element.setX(x);
        assertEquals(x, element.getX());
	}

	@Test
	public void testSetX() {
        model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
        int x = (int)(Math.random()*10);
        element.setX(x);
        assertEquals(x, element.getX());
	}

	@Test
	public void testGetY() {
		  model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
	        int y = (int)(Math.random()*10);
	        element.setY(y);
	        assertEquals(y, element.getY());
	}

	@Test
	public void testSetY() {
		model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
        int y = (int)(Math.random()*10);
        element.setY(y);
        assertEquals(y, element.getY());
	}

}

package model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The Class TestElement.
 *
 * @author Adrien Thevenet alias chaospreader
 */
public class TestElement {

	/**
	 * test method for {@link model.Element#Element(String, Permeability)}
	 * whit a random image url taken on the Internet
	 * 
	 */
	@Test
	public void testElement() {
		assertNotNull(new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.PENETRABLE));
	}
/**
 * test method for {@link model.Element#getPermeability()}
 */
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

	/**
	 * test method for {@link model.Element#setPermeability(Permeability)}
	 */
	@Test
	public void testSetPermeability() {
		double rand = Math.random();
        if (rand < 0.5){
        	model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.PENETRABLE);
        	element.setPermeability(Permeability.BLOCKING);
        	assertEquals(Permeability.BLOCKING, element.getPermeability());
        }
        else{
        	model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
        	element.setPermeability(Permeability.PENETRABLE);
        	assertEquals(Permeability.PENETRABLE, element.getPermeability());
        }
	}
	/*
	 * test method for {@link model.Element#getImage()}
	 * 
	 * to review
	 */
	@Test
	public void testGetImage() {
		model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
		assertEquals("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", element.getImage());
		}
	
	/*
	 * test method for {@link model.Element#setImage(String)}
	 * 
	 * to review
	 */
	@Test
	public void testSetImage() {
		model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
		element.setImage("http://www.laboiteverte.fr/wp-content/uploads/2014/11/element-jeu-video-06.jpg");
		assertEquals("http://www.laboiteverte.fr/wp-content/uploads/2014/11/element-jeu-video-06.jpg", element.getImage());
	}

	/**
	 * test method for {@link model.Element#getX()}
	 */
	@Test
	public void testGetX() {
        model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
        int x = (int)(Math.random()*10);
        element.setX(x);
        assertEquals(x, element.getX());
	}

	/**
	 * test method for {@link model.Element#setX(int)}
	 */
	@Test
	public void testSetX() {
        model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
        int x = (int)(Math.random()*10);
        element.setX(x);
        assertEquals(x, element.getX());
	}

	/**
	 * test method for {@link model.Element#getY()}
	 */
	@Test
	public void testGetY() {
		  model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
	        int y = (int)(Math.random()*10);
	        element.setY(y);
	        assertEquals(y, element.getY());
	}

	/**
	 * test method for {@link model.Element#setY(int)}
	 */
	@Test
	public void testSetY() {
		model.Element element = new model.Element("http://i21.servimg.com/u/f21/15/31/14/80/ludort11.png", Permeability.BLOCKING);
        int y = (int)(Math.random()*10);
        element.setY(y);
        assertEquals(y, element.getY());
	}

}

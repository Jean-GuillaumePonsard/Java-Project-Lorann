package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * The Class Element.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Element {

	/** The element's permeability */
	private Permeability permeability;
	
	/** The element's x position */
	private int x;
	
	/** The element's y position */
	private int y;
	
	/** The element's image = A sprite */
	private Image image;
	
	
	/** 
	 *	Instantiates a new Element 
	 *
	 *	@param url
	 *	@param permeability
	 */
	
	public Element(String url, Permeability permeability)
	{
		setImage(url);
		this.permeability = permeability;
	}
	
	/**
	 * Gets the permeability.
	 *
	 * @return the permeability of the element
	 */
	
	public Permeability getPermeability() {
		return permeability;
	}
	
	/**
	 * Sets the permeability.
	 *
	 * @param permeability
	 *          the new permeability
	 */
	
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
	/**
	 * Gets the element's image.
	 *
	 * @return the element's image
	 */
	
	public Image getImage() {
		return this.image;
	}

	/**
	 * Sets the image.
	 *
	 * @param image
	 *          the new image by image
	 */
	
	public void setImage(Image image) {
		this.image = image;
	}
	
	/**
	 * Sets the image.
	 *
	 * @param url
	 *          the new image's url
	 */
	
	public void setImage(String url)
	{
		//Another method to set the Sprite of an object
		try{
			
			this.image = ImageIO.read(new File(url));
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}


	/**
	 * Gets the element's x position.
	 *
	 * @return the element's x position
	 */
	
	public int getX() {
		return this.x;
	}

	
	/**
	 * Sets the element's x position.
	 *
	 * @param x
	 *          the x position of the element
	 */
	
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Gets the element's y position.
	 *
	 * @return the element's y position
	 */

	public int getY() {
		return this.y;
	}

	/**
	 * Sets the element's y position.
	 *
	 * @param y
	 *          the y position of the element
	 */

	public void setY(int y) {
		this.y = y;
	}
	
	
}

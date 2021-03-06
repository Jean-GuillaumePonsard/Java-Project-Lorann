package model;

import java.awt.Image;
import java.io.IOException;
import java.util.Observable;

import javax.imageio.ImageIO;

import contract.IElement;
import contract.Permeability;

/**
 * The Class Element.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class Element extends Observable implements IElement {

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
	 *		The path of the image
	 *	@param permeability
	 *		The permeability of the element
	 */
	
	public Element(String url, Permeability permeability)
	{
		setImage(url);
		this.permeability = permeability;
	}
	
	/* (non-Javadoc)
	 * @see model.IElement#getPermeability()
	 */
	
	public Permeability getPermeability() {
		return permeability;
	}
	
	/* (non-Javadoc)
	 * @see model.IElement#setPermeability(model.Permeability)
	 */
	
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
		modelChanged();
	}
	
	/* (non-Javadoc)
	 * @see model.IElement#getImage()
	 */
	
	public Image getImage() {
		return this.image;
	}

	/* (non-Javadoc)
	 * @see model.IElement#setImage(java.awt.Image)
	 */
	
	public void setImage(Image image) {
		this.image = image;
		modelChanged();
	}
	
	/* (non-Javadoc)
	 * @see model.IElement#setImage(java.lang.String)
	 */
	
	public void setImage(String url)
	{
		//Another method to set the Sprite of an object
		try{
			
			this.image = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(url));
			modelChanged();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}


	/* (non-Javadoc)
	 * @see model.IElement#getX()
	 */
	
	public int getX() {
		return this.x;
	}

	
	/* (non-Javadoc)
	 * @see model.IElement#setX(int)
	 */
	
	public void setX(int x) {
		this.x = x;
		modelChanged();
	}

	/* (non-Javadoc)
	 * @see model.IElement#getY()
	 */

	public int getY() {
		return this.y;
	}

	/* (non-Javadoc)
	 * @see model.IElement#setY(int)
	 */

	public void setY(int y) {
		this.y = y;
		modelChanged();
	}
	
	/**
	 * Notify Observers that the model changed
	 * 
	 */
	
	public void modelChanged()
	{
		setChanged();
		notifyObservers();
	}
	/*
	 * (non-Javadoc)
	 * @see contract.IElement#getObservable()
	 */
	
	public Observable getObservable()
	{
		return this;
	}
	
	
}

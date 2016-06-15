package model;

import java.awt.Image;

public class Sprite {

	private Image image;
	
	public Sprite(String url)
	{
		//Loading Sprite
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	
	public void setImage(String url)
	{
		//Another method to set the Sprite of an object
	}
}

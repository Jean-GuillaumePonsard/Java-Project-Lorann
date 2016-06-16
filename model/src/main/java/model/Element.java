package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Element {

	private Permeability permeability;
	private int x;
	private int y;
	private Image image;
	
	
	public Element(String url, Permeability permeability)
	{
		setImage(url);
		this.permeability = permeability;
	}
	
	
	public Permeability getPermeability() {
		return permeability;
	}
	
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
	public Image getImage() {
		return this.image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	
	public void setImage(String url)
	{
		//Another method to set the Sprite of an object
		try{
			
			this.image = ImageIO.read(new File("C:/Users/Jean-Guillaume P/Documents/Exia/Projet Java/Java/Java-Project-Lorann/model/src/main/resources/"+url));
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}


	public int getX() {
		return this.x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return this.y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
}

package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {

	private Image image;
	
	public Sprite(String url)
	{
		setImage(url);
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
		try{
			
			image = ImageIO.read(new File("C:/Users/Jean-Guillaume P/Documents/Exia/Projet Java/Java/Java-Project-Lorann/model/src/main/resources/"+url));
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

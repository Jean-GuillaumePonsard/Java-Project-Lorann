package model;

public class Element {

	private Sprite sprite;
	private Permeability permeability;
	private int x;
	private int y;
	
	
	public Element(String url, Permeability permeability)
	{
		
	}
	
	
	public Permeability getPermeability() {
		return permeability;
	}
	
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
	public Sprite getSprite() {
		return sprite;
	}
	
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
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

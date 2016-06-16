package model;

public class LorannMap {

	private Element Element[][];
	
	
	private int widht;
	private int height;
	
	
	public LorannMap(int widht, int height)
	{
		this.widht = widht;
		this.height = height;
				
		
	}
	
	
	public Element[][] getElement() {
		return Element;
	}


	public void setElement(Element element[][]) {
		Element = element;
	}


	public int getWidht() {
		return widht;
	}


	public int getHeight() {
		return height;
	}

	
}

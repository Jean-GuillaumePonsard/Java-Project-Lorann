package model;

public class LorannMap {

	private Element elements[][];
	private Lorann lorann;
	
	
	
	private int widht;
	private int height;
	
	
	public LorannMap(int widht, int height)
	{
		this.widht = widht;
		this.height = height;
		this.elements = new Element[this.getWidht()][this.getHeight()];	
		
	}
	
	
	public Element[][] getElements() {
		return elements;
	}
	
	public void addElement(Element element, final int x, final int y)
	{
		this.elements[x][y] = element;
	}


	public void setElement(Element element, int x, int y) {
		this.elements[x][y] = element;
	}
	
	public Element getElement(int x, int y)
	{
		if(x < 0 || y <0 || x > this.getWidht() || y > this.getHeight())
		{
			return null;
		}
		
		return elements[x][y];
	}


	public int getWidht() {
		return this.widht;
	}


	public int getHeight() {
		return this.height;
	}
	
	public Lorann getLorann()
	{
		return this.lorann;
	}

	
}

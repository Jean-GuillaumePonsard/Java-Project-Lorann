package model;

public class LorannMap {

	private Element element[][];
	private Lorann lorann;
	
	
	
	private int widht;
	private int height;
	
	
	public LorannMap(int widht, int height)
	{
		this.widht = widht;
		this.height = height;
				
		
	}
	
	
	public Element[][] getElements() {
		return element;
	}
	
	public void addElement(Element element, final int x, final int y)
	{
		this.element[x][y] = element;
	}


	public void setElement(Element element, int x, int y) {
		this.element[x][y] = element;
	}
	
	public Element getElement(int x, int y)
	{
		if(x < 0 || y <0)
		{
			return null;
		}
		
		return element;
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

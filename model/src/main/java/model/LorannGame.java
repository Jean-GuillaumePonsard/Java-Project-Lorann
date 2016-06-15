package model;

public class LorannGame {

	private LorannMap lorannMap;
	private Element Element[][];
	
	
	public LorannGame()
	{
		
	}


	public LorannMap getLorannMap() {
		return lorannMap;
	}


	public void setLorannMap(LorannMap lorannMap) {
		this.lorannMap = lorannMap;
	}


	public Element[][] getElement() {
		return Element;
	}


	public void setElement(Element element[][]) {
		Element = element;
	}
	
}

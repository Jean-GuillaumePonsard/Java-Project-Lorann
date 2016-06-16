package model;

public class Loot extends MotionlessElement {

	public Loot(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}
}

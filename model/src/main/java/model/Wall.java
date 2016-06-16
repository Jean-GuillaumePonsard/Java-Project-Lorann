package model;

public class Wall extends MotionlessElement {

	public Wall(int x, int y, String url)
	{
		super(url, Permeability.BLOCKING);
		setX(x);
		setY(y);
	}
}

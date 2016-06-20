package mock;

import contract.IWall;
import contract.Permeability;

public class MockWall implements IWall{

	int xPosition;
	int yPosition;
	
	public MockWall(int x, int y){
		
		Permeability wall = Permeability.BLOCKING;
		xPosition=x;
		yPosition=y;
	}
	public int getX() {
		return this.xPosition;
	}
	
	public void setX(int x){
		this.xPosition = x;
	}
	
	public int getY() {
		return this.yPosition;
	}
	
	public void setY(int y){
		this.yPosition = y;
	}
}

package mock;

import contract.IMonster;
import contract.Permeability;

public class MockMonster implements IMonster {

	int xPosition;
	int yPosition;
	
	public MockMonster(int x, int y){
		
		Permeability monster = Permeability.PENETRABLE;
		xPosition = x;
		yPosition = y;
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

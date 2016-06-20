package mock;


import contract.ILoot;
import contract.Permeability;

public class MockCrystalBubble implements ILoot {

	int xPosition;
	int yPosition;
	int pointsGiven;
	
	public MockCrystalBubble(int x, int y,int pointGiven){
		
		Permeability crystalBubble = Permeability.PENETRABLE;
		xPosition=x;
		yPosition=y;
		this.pointsGiven = pointGiven;
	}
	
	public int getPointsGiven() {
		
		return this.pointsGiven;
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

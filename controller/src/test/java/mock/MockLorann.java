package mock;

import contract.ILorann;
import contract.LorannStatement;
import contract.Permeability;


public class MockLorann implements ILorann {

	int xPosition;
	int yPosition;
	
	public MockLorann(int x, int y)
	{
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
	public LorannStatement getLorannStatement() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLorannStatement(LorannStatement lorannStatement) {
		// TODO Auto-generated method stub
		
	}

	public int getScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addScore(int score) {
		// TODO Auto-generated method stub
		
	}

}
package mock;

import contract.ISpell;
import contract.Permeability;
import contract.SpellColor;
import contract.SpellStatement;

public class MockSpell implements ISpell {

	int xPosition;
	int yPosition;
	
	public MockSpell(int x,int y){
		
		Permeability spell = Permeability.PENETRABLE;
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
		
	
	public SpellStatement getSpellStatement() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSpellStatement(SpellStatement spellStatement) {
		// TODO Auto-generated method stub
		
	}

	public SpellColor getSpellColor() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSpellColor(SpellColor spellColor) {
		// TODO Auto-generated method stub
		
	}

	public void setNextColor() {
		// TODO Auto-generated method stub
		
	}

}

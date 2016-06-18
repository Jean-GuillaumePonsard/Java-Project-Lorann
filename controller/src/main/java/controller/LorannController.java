package controller;



import java.util.ArrayList;

import javax.swing.JOptionPane;

import contract.ControllerOrder;
import contract.GateStatement;
import contract.ICoins;
import contract.IController;
import contract.ICrystalBubble;
import contract.IDoor;
import contract.ILorannGame;
import contract.ILorannMap;
import contract.ILorannView;
import contract.IMonster;
import contract.ISpell;
import contract.IElement;
import contract.ILoot;
import contract.ILorann;
import contract.ILorannController;
import contract.IView;
import contract.LorannStatement;
import contract.Permeability;
import contract.SpellStatement;

//TODO: Auto-generated Javadoc
/**
* The Class LorannController.
* 
*/
public class LorannController implements ILorannController {

	/** The view. */
	private ILorannView		view;

	/** The model. */
	private ILorannGame		lorannGame;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public LorannController(final ILorannView view, final ILorannGame lorannGame) {
		this.setView(view);
		this.setModel(lorannGame);
		Thread thread = new Thread(new Ticks(this));
		thread.start();
	}
	
	/**
	 * Sets the view.
	 *
	 * @param view
	 *          the new view
	 */
	private void setView(final ILorannView view) {
		this.view = view;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final ILorannGame lorannGame) {
		this.lorannGame = lorannGame;
	}
	
	/**
	 * Move Element
	 * 
	 * @param element
	 * 		the  mobile element who will move
	 * @param x
	 * 		the x position of a mobile element
	 * @param y
	 * 		the y position of a mobile element
	 */
	public void moveElement(IElement element, int x, int y){
				
		element.setX(element.getX()+x);
		element.setY(element.getY()+y);
		callChange();
	}
	
	/**
	 * Permit to know if a monster or Lorann will be not blocked by a map element
	 * 
	 * @param x
	 * 		the x position of a static element on the map 		
	 * @param y
	 * 		the y position of a static element on the map 
	 */
	private boolean getBlocked(final int x, final int y){
		return getElement(x, y).getPermeability() == Permeability.PENETRABLE;
	}
	
	/**
	 *get the Elements
	 * 
	 *@return the Element's position
	 */
	private IElement getElement(final int x, final int y)
	{
		return lorannGame.getLorannMap().getElement(x, y);
	}
	
	/**
	 * move monsters
	 *  
	 */
	public void monsterAi(){
		
		for(IMonster monster : lorannGame.getLorannMap().getMonsters()){
			double random = Math.random();
			int monsterX = ((IElement)monster).getX();
			int monsterY = ((IElement)monster).getY();
			
			checkColisionMonsterWithLorann((IElement)monster);
			if(checkColisionMonsterWithSpell((IElement)monster) == true)
			{
				killMonster();
				return;
			}else {
			
				if(random <= .2d && getBlocked(monsterX, monsterY-1) && checkImpassableElements(monsterX, monsterY-1) && checkIfMonsterToPosition(monsterX, monsterY-1) == false){
					
					moveElement((IElement)monster, 0, -1);
					checkColisionMonsterWithLorann((IElement)monster);
					
				}else if(random <= .4d && getBlocked(monsterX, monsterY+1) && checkImpassableElements(monsterX, monsterY+1) && checkIfMonsterToPosition(monsterX, monsterY+1) == false){

					moveElement((IElement)monster, 0, +1);
					checkColisionMonsterWithLorann((IElement)monster);
				}else if(random <= .6d && getBlocked(monsterX-1, monsterY) && checkImpassableElements(monsterX-1, monsterY) && checkIfMonsterToPosition(monsterX-1, monsterY) == false){

					moveElement((IElement)monster, -1, 0);
					checkColisionMonsterWithLorann((IElement)monster);
				}else if(random <= .8d && getBlocked(monsterX+1, monsterY) && checkImpassableElements(monsterX+1, monsterY) && checkIfMonsterToPosition(monsterX+1, monsterY) == false){

					moveElement((IElement)monster, +1, 0);
					checkColisionMonsterWithLorann((IElement)monster);
				}
			}
			
		}
	}
	
	public boolean checkImpassableElements(final int x, final int y)
	{
		IElement element = lorannGame.getLorannMap().getElement(x, y);
		if(element instanceof ICoins)
		{
			System.out.println("Element encounter coins");
			return false;
		}else if(element instanceof ICrystalBubble)
		{
			System.out.println("Element encounter crystalBubble");
			return false;
		}else if (element instanceof IDoor)
		{
			System.out.println("Element encounter door");
			return false;
		}
		
		return true;
	}
	
	/*
	 * Launch Lorann's spell
	 * 
	 */
	public void launchSpell(IElement spell, IElement lorann)
	{
		if(((ISpell) spell).getSpellStatement() == SpellStatement.INPOCKET)
		{
			if(((ILorann) lorann).getLorannStatement() == LorannStatement.UP)
			{
				if(getBlocked(lorann.getX(), lorann.getY()-1) && checkImpassableElements(lorann.getX(), lorann.getY()-1))
				{
					((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDUP);
					spell.setX(lorann.getX());
					spell.setY(lorann.getY()-1);
					callChange();
					//moveSpell();
				}
										
			}else if(((ILorann) lorann).getLorannStatement() == LorannStatement.DOWN)
			{
				if(getBlocked(lorann.getX(), lorann.getY()+1) && checkImpassableElements(lorann.getX(), lorann.getY()+1))
				{
					((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDDOWN);
					spell.setX(lorann.getX());
					spell.setY(lorann.getY()+1);
					callChange();
					//moveSpell();
				}

			}else if(((ILorann) lorann).getLorannStatement() == LorannStatement.LEFT)
			{
				if(getBlocked(lorann.getX()-1, lorann.getY()) && checkImpassableElements(lorann.getX()-1, lorann.getY()))
				{
					((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDLEFT);
					spell.setX(lorann.getX()-1);
					spell.setY(lorann.getY());
					callChange();
					//moveSpell();
				}
					
			}else if(((ILorann) lorann).getLorannStatement() == LorannStatement.RIGHT)
			{
				if(getBlocked(lorann.getX()+1, lorann.getY()) && checkImpassableElements(lorann.getX()+1, lorann.getY()))
				{
					((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDRIGHT);
					spell.setX(lorann.getX()+1);
					spell.setY(lorann.getY());
					callChange();
					//moveSpell();
				}
			}
			
		}else{System.out.println("Unable to launch Spell");}
		//this.view.printMessage("Space");
	}
	
	/*
	 * kill Lorann when he touched a monster or a locked door
	 * 
	 */
	public void die()
	{
		IElement lorann = lorannGame.getLorannMap().getLorann();
		printMessage("GAME OVER, you scored :"+((ILorann)lorann).getScore()+"points");
		exit(0);
	}
	
	public void win()
	{
		IElement lorann = lorannGame.getLorannMap().getLorann();
		printMessage("YOU WIN, you scored :"+((ILorann)lorann).getScore()+"points");
		exit(0);
	}
	
	public void exit(int code)
	{
		System.exit(code);
	}
	
	/* (non-Javadoc)
	 * @see controller.ILorannController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(ControllerOrder controllerOrder) {
		IElement lorann = lorannGame.getLorannMap().getLorann();
		IElement spell = lorannGame.getLorannMap().getLorannSpell();
		
		switch (controllerOrder){
		
			case UP:
				((ILorann) lorann).setLorannStatement(LorannStatement.UP);
				lorann.setImage("sprite/lorann_u.png");
				//this.view.printMessage("Up");
				if(getBlocked(lorann.getX(), lorann.getY()-1))
				{
					System.out.println("Move possible ^");
					if(((ISpell)spell).getSpellStatement() == SpellStatement.LAUNCHEDDOWN && spell.getY() == lorann.getY() && spell.getX() == lorann.getX())
					{
						((ISpell)spell).setSpellStatement(SpellStatement.INPOCKET);
					}
					callChange();
					moveElement(lorann, 0, -1);
					checkColisionLorann();
					
				}	
				break;
				
			case DOWN:
				((ILorann) lorann).setLorannStatement(LorannStatement.DOWN);
				//this.view.printMessage("Down");
				lorann.setImage("sprite/lorann_b.png");
				if(getBlocked(lorann.getX(), lorann.getY()+1))
				{
					System.out.println("Move possible  v");
					if(((ISpell)spell).getSpellStatement() == SpellStatement.LAUNCHEDUP && spell.getY() == lorann.getY() && spell.getX() == lorann.getX())
					{
						((ISpell)spell).setSpellStatement(SpellStatement.INPOCKET);
					}
					callChange();
					moveElement(lorann, 0, +1);
					checkColisionLorann();
					
				}	
				break;
				
			case LEFT:
				((ILorann) lorann).setLorannStatement(LorannStatement.LEFT);
				//this.view.printMessage("left");
				lorann.setImage("sprite/lorann_l.png");
				if(getBlocked(lorann.getX()-1, lorann.getY()))
				{
					System.out.println("Move possible <-");
					if(((ISpell)spell).getSpellStatement() == SpellStatement.LAUNCHEDRIGHT && spell.getX() == lorann.getX() && spell.getY() == lorann.getY())
					{
						((ISpell)spell).setSpellStatement(SpellStatement.INPOCKET);
					}
					callChange();
					moveElement(lorann, -1, 0);
					checkColisionLorann();
				}	
				break;
				
			case RIGHT:
				((ILorann) lorann).setLorannStatement(LorannStatement.RIGHT);
				//this.view.printMessage("Right");
				lorann.setImage("sprite/lorann_r.png");
				if(getBlocked(lorann.getX()+1, lorann.getY()))
				{
					System.out.println("Move possible ->");
					if(((ISpell)spell).getSpellStatement() == SpellStatement.LAUNCHEDLEFT && spell.getX() == lorann.getX() && spell.getY() == lorann.getY())
					{
						((ISpell)spell).setSpellStatement(SpellStatement.INPOCKET);
					}
					callChange();
					moveElement(lorann, +1, 0);
					checkColisionLorann();
				}				
				break;
				
			case LAUNCHSPELL:
				launchSpell(spell, lorann);
				
				break;
			default:
				break;		
		}
	}
	
	
	public void moveSpell() {
		//First Step: Checking if spell is launched
		IElement spell = lorannGame.getLorannMap().getLorannSpell();
		if(((ISpell) spell).getSpellStatement() == SpellStatement.INPOCKET)
		{
			return;
		}
		
		//Second Step: Changing spell color
		
		((ISpell) spell).setNextColor();
		
		
		//Third Step: Checking for monster and kill those who has to die
		killMonster();
		
		//Forth Step: Checking for Lorann
		
		if(lorannGame.getLorannMap().getLorann().getX() == lorannGame.getLorannMap().getLorannSpell().getX() && lorannGame.getLorannMap().getLorann().getY() == lorannGame.getLorannMap().getLorannSpell().getY())
		{
			System.out.println("Collision Dectected between spell and lorann");
			((ISpell) spell).setSpellStatement(SpellStatement.INPOCKET);
			callChange();
			return;
		}
		
		//Fifth Step: Moving spell: checking if spell has to go in the opposite direction and then move spell
		switch(((ISpell) spell).getSpellStatement())
		{
		case LAUNCHEDDOWN:
			if(getBlocked(spell.getX(), spell.getY()+1) && checkImpassableElements(spell.getX(), spell.getY()+1))
			{
				spell.setY(spell.getY()+1);
			}else{
				((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDUP);
			}
			break;
		case LAUNCHEDLEFT:
			if(getBlocked(spell.getX()-1, spell.getY()) && checkImpassableElements(spell.getX()-1, spell.getY()))
			{
				spell.setX(spell.getX()-1);
			}else{
				((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDRIGHT);
			}
			break;
		case LAUNCHEDRIGHT:
			if(getBlocked(spell.getX()+1, spell.getY()) && checkImpassableElements(spell.getX()+1, spell.getY()))
			{
				spell.setX(spell.getX()+1);
			}else{
				((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDLEFT);
			}
			break;
		case LAUNCHEDUP:
			if(getBlocked(spell.getX(), spell.getY()-1) && checkImpassableElements(spell.getX(), spell.getY()-1))
			{
				spell.setY(spell.getY()-1);
			}else{
				((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDDOWN);
			}
			break;
		default:
			break;
		
		}
		

	callChange();
		
}
	
	public void checkColisionLorannWithLoot()
	{
		IElement lorann = lorannGame.getLorannMap().getLorann();
		IElement element = lorannGame.getLorannMap().getElement(lorann.getX(), lorann.getY());
		if( element instanceof ILoot)
		{
			System.out.println("Picked coin");
			((ILorann)lorann).addScore(((ILoot)element).getPointsGiven());
			System.out.println("NEW SCORE : "+((ILorann)lorann).getScore());
			lorannGame.getLorannMap().destroyElement(lorann.getX(), lorann.getY());
			callChange();
		}
		if(element instanceof ICrystalBubble)
		{
			lorannGame.getLorannMap().openDoor();
		}
	}
	
	public void checkColisionLorannWithDoor()
	{
		IElement lorann = lorannGame.getLorannMap().getLorann();
		IElement element = lorannGame.getLorannMap().getElement(lorann.getX(), lorann.getY());
		
		if(element instanceof IDoor)
		{
			if(((IDoor) element).getGateStatement() == GateStatement.LOCK)
			{
				System.out.println("You Died");
				die();
			}else if(((IDoor) element).getGateStatement() == GateStatement.OPEN)
			{
				System.out.println("You Won");
				win();
			}
		}
				
	}
	
	public void checkColisionLorannWithMonster()
	{		
		IElement lorann = lorannGame.getLorannMap().getLorann();
		for(IMonster monster : lorannGame.getLorannMap().getMonsters())
		{
			if(((IElement)monster).getX() == lorann.getX() && ((IElement)monster).getY() == lorann.getY())
			{
				System.out.println("Collision Detected between Lorann and a monster");
				callChange();
				die();
			}
		}	
	}
	
	public void checkColisionLorann()
	{
		checkColisionLorannWithLoot();
		checkColisionLorannWithDoor();
		checkColisionLorannWithMonster();
	}
	
	public void checkColisionMonsterWithLorann(IElement monster)
	{
		IElement lorann = lorannGame.getLorannMap().getLorann();
		if(monster.getX() == lorann.getX() && monster.getY() == lorann.getY())
		{
			callChange();
			die();
		}
	}
	
	public boolean checkColisionMonsterWithSpell(IElement monster)
	{
		IElement spell = lorannGame.getLorannMap().getLorannSpell();
		if(((ISpell)spell).getSpellStatement() != SpellStatement.INPOCKET)
		{
			if(monster.getX() == spell.getX() && monster.getY() == spell.getY())
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean checkIfMonsterToPosition(final int x, final int y)
	{
		for(IMonster monster : lorannGame.getLorannMap().getMonsters())
		{
			if(((IElement)monster).getX() == x && ((IElement)monster).getY() == y)
			{
				System.out.println("Monster near monster, impossible move of monster");
				return true;
			}
		}		
		return false;
	}
	
	public void killMonster()
	{
		ArrayList<IMonster> monsters = lorannGame.getLorannMap().getMonsters();
		IElement spell = lorannGame.getLorannMap().getLorannSpell();
		
		for(int index = 0; index < monsters.size(); index++)
		{
			IElement monster = (IElement) monsters.get(index);
			if((monster).getX() == lorannGame.getLorannMap().getLorannSpell().getX() && (monster).getY() == lorannGame.getLorannMap().getLorannSpell().getY())
			{
				System.out.println("Collision Detected between the spell and a monster");
				lorannGame.getLorannMap().removeMonsterByIndex(index);
				callChange();
				((ISpell) spell).setSpellStatement(SpellStatement.INPOCKET);
				callChange();
				return;
			}
		}
	}
	
	/**
	 * Prints a message.
	 *
	 * @param message
	 *          the message
	 */
	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void callChange()
	{
		lorannGame.changeLorannGame();
	}

}

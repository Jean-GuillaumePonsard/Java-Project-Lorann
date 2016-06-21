package controller;



import java.util.ArrayList;

import javax.swing.JOptionPane;

import contract.ControllerOrder;
import contract.GateStatement;
import contract.ICoins;
import contract.ICrystalBubble;
import contract.IDoor;
import contract.ILorannGame;

import contract.ILorannView;
import contract.IMonster;
import contract.ISpell;
import contract.IElement;
import contract.ILoot;
import contract.ILorann;
import contract.ILorannController;
import contract.LorannStatement;
import contract.Permeability;
import contract.SpellStatement;


/**
* The Class LorannController.
* 
* @author Adrien Thevenet, Jean-Guillaume Ponsard
* @version 16.06.2016
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
	 * @param lorannGame
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
	 * @param lorannGame
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
				
		lorannGame.getLorannMap().moveElement(element, x, y);
		
	}
	
	/**
	 * Allows to know if a monster or Lorann is blocked by a map element
	 * 
	 * @param x
	 * 		the x position of a static element on the map 		
	 * @param y
	 * 		the y position of a static element on the map 
	 * 
	 * 	@return boolean
	 * 	If the permeability of the element is PENETRABLE then it returns true otherwise it returns false
	 */
	private boolean getBlocked(final int x, final int y){
		return getElement(x, y).getPermeability() == Permeability.PENETRABLE;
	}
	
	/**
	 * Gets the Elements
	 * 
	 * @param x
	 * 	The x position of the element that needs to be found
	 * @param y
	 * 	The y position of the element that needs to be found
	 * 
	 *@return the Element's position
	 */
	private IElement getElement(final int x, final int y)
	{
		return lorannGame.getLorannMap().getElement(x, y);
	}
	
	/**
	 * Moves monsters
	 *  
	 */
	public void monsterAi(){
		
		for(IMonster monster : lorannGame.getLorannMap().getMonsters()){
			double random = Math.random();
			int monsterX = ((IElement)monster).getX();
			int monsterY = ((IElement)monster).getY();
			IElement target = lorannGame.getLorannMap().getLorann();
			int targetX = ((IElement)target).getX();
			int targetY = ((IElement)target).getY();
			
			checkColisionMonsterWithLorann((IElement)monster);
			if(checkColisionMonsterWithSpell((IElement)monster) == true)
			{
				killMonster();
				return;
			}
			
			if(random <= .4d){
			
				if(monsterY > targetY && getBlocked(monsterX, monsterY-1) && checkImpassableElements(monsterX, monsterY-1) && checkIfMonsterToPosition(monsterX, monsterY-1) == false){
				
					moveElement((IElement)monster, 0, -1);
					checkColisionMonsterWithLorann((IElement)monster);
				
				}else if(monsterY < targetY && getBlocked(monsterX, monsterY+1) && checkImpassableElements(monsterX, monsterY+1) && checkIfMonsterToPosition(monsterX, monsterY+1) == false){

					moveElement((IElement)monster, 0, +1);
					checkColisionMonsterWithLorann((IElement)monster);
				}
			}
			else if(random <= .8d){
				
			
				if(monsterX > targetX && getBlocked(monsterX-1, monsterY) && checkImpassableElements(monsterX-1, monsterY) && checkIfMonsterToPosition(monsterX-1, monsterY) == false){

					moveElement((IElement)monster, -1, 0);
					checkColisionMonsterWithLorann((IElement)monster);
					
				}else if(monsterX < targetX && getBlocked(monsterX+1, monsterY) && checkImpassableElements(monsterX+1, monsterY) && checkIfMonsterToPosition(monsterX+1, monsterY) == false){

					moveElement((IElement)monster, +1, 0);
					checkColisionMonsterWithLorann((IElement)monster);
				}
			}
		}
	}
	
	
	/**
	 * Check if there is elements that are not allowed to cross
	 * 
	 * @param x
	 * 	The x position of the element that needs to be checked
	 * @param y
	 * 	The y position of the element that needs to be checked
	 * @return boolean. It depends on if the element can be crossed by the spell or a monster: 
	 * 	true = the element can be crossed
	 * 	false = the element can't be crossed
	 */
	
	public boolean checkImpassableElements(final int x, final int y)
	{
		IElement element = lorannGame.getLorannMap().getElement(x, y);
		if(element instanceof ICoins)
		{
			
			return false;
		}else if(element instanceof ICrystalBubble)
		{
			
			return false;
		}else if (element instanceof IDoor)
		{
			
			return false;
		}
		
		return true;
	}
	
	/**
	 * Launchs Lorann's spell
	 * 
	 * @param spell
	 * 	Lorann's spell
	 * @param lorann
	 * 	Our hero, lorann
	 */
	public void launchSpell(IElement spell, IElement lorann)
	{
		
		if(((ISpell) spell).getSpellStatement() == SpellStatement.INPOCKET)
		{
			int spellX = lorann.getX()-spell.getX();
			int spellY = lorann.getY()-spell.getY();
			if(((ILorann) lorann).getLorannStatement() == LorannStatement.UP)
			{
				if(getBlocked(lorann.getX(), lorann.getY()-1) && checkImpassableElements(lorann.getX(), lorann.getY()-1))
				{
					((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDUP);
					moveElement(spell, spellX, spellY-1);
					
				}
										
			}else if(((ILorann) lorann).getLorannStatement() == LorannStatement.DOWN)
			{
				if(getBlocked(lorann.getX(), lorann.getY()+1) && checkImpassableElements(lorann.getX(), lorann.getY()+1))
				{
					((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDDOWN);
					moveElement(spell, spellX, spellY+1);

				}

			}else if(((ILorann) lorann).getLorannStatement() == LorannStatement.LEFT)
			{
				if(getBlocked(lorann.getX()-1, lorann.getY()) && checkImpassableElements(lorann.getX()-1, lorann.getY()))
				{
					((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDLEFT);
					moveElement(spell, spellX-1, spellY);
					
				}
					
			}else if(((ILorann) lorann).getLorannStatement() == LorannStatement.RIGHT)
			{
				if(getBlocked(lorann.getX()+1, lorann.getY()) && checkImpassableElements(lorann.getX()+1, lorann.getY()))
				{
					((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDRIGHT);
					moveElement(spell, spellX+1, spellY);

				}
			}
			
		}
		
	}
	
	/**
	 * 
	 * Kills Lorann when he touched a monster or a locked door so display game over
	 */
	public void die()
	{
		IElement lorann = lorannGame.getLorannMap().getLorann();
		printMessage("GAME OVER, you scored :"+((ILorann)lorann).getScore()+"points");
		exit(0);
	}
	
	/**
	 * Displays Win message
	 * 
	 */
	
	public void win()
	{
		IElement lorann = lorannGame.getLorannMap().getLorann();
		printMessage("YOU WON, you scored :"+((ILorann)lorann).getScore()+"points");
		exit(0);
	}
	
	/**
	 * Terminates process, exit game
	 * 
	 * @param code
	 * 	The exit that that will says if the process close with an anormal status or not
	 */
	
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
				
				if(getBlocked(lorann.getX(), lorann.getY()-1))
				{
					
					if(((ISpell)spell).getSpellStatement() == SpellStatement.LAUNCHEDDOWN && spell.getY() == lorann.getY() && spell.getX() == lorann.getX())
					{
						((ISpell)spell).setSpellStatement(SpellStatement.INPOCKET);
					}
					
					moveElement(lorann, 0, -1);
					checkColisionLorann();
					
				}	
				break;
				
			case DOWN:
				((ILorann) lorann).setLorannStatement(LorannStatement.DOWN);
				
				lorann.setImage("sprite/lorann_b.png");
				if(getBlocked(lorann.getX(), lorann.getY()+1))
				{
					
					if(((ISpell)spell).getSpellStatement() == SpellStatement.LAUNCHEDUP && spell.getY() == lorann.getY() && spell.getX() == lorann.getX())
					{
						((ISpell)spell).setSpellStatement(SpellStatement.INPOCKET);
					}
					
					moveElement(lorann, 0, 1);
					checkColisionLorann();
					
				}	
				break;
				
			case LEFT:
				((ILorann) lorann).setLorannStatement(LorannStatement.LEFT);
				
				lorann.setImage("sprite/lorann_l.png");
				if(getBlocked(lorann.getX()-1, lorann.getY()))
				{
					
					if(((ISpell)spell).getSpellStatement() == SpellStatement.LAUNCHEDRIGHT && spell.getX() == lorann.getX() && spell.getY() == lorann.getY())
					{
						((ISpell)spell).setSpellStatement(SpellStatement.INPOCKET);
					}
					
					moveElement(lorann, -1, 0);
					checkColisionLorann();
				}	
				break;
				
			case RIGHT:
				((ILorann) lorann).setLorannStatement(LorannStatement.RIGHT);
				
				lorann.setImage("sprite/lorann_r.png");
				if(getBlocked(lorann.getX()+1, lorann.getY()))
				{
					
					if(((ISpell)spell).getSpellStatement() == SpellStatement.LAUNCHEDLEFT && spell.getX() == lorann.getX() && spell.getY() == lorann.getY())
					{
						((ISpell)spell).setSpellStatement(SpellStatement.INPOCKET);
					}
					
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
	
	/**
	 * Moves the spell
	 * 
	 */
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
			
			((ISpell) spell).setSpellStatement(SpellStatement.INPOCKET);
			
			return;
		}
		
		//Fifth Step: Moving spell: checking if spell has to go in the opposite direction and then move spell
		switch(((ISpell) spell).getSpellStatement())
		{
		case LAUNCHEDDOWN:
			if(getBlocked(spell.getX(), spell.getY()+1) && checkImpassableElements(spell.getX(), spell.getY()+1))
			{
				moveElement(spell, 0, 1);
				
			}else{
				((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDUP);
			}
			break;
		case LAUNCHEDLEFT:
			if(getBlocked(spell.getX()-1, spell.getY()) && checkImpassableElements(spell.getX()-1, spell.getY()))
			{
				moveElement(spell, -1, 0);
				
			}else{
				((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDRIGHT);
			}
			break;
		case LAUNCHEDRIGHT:
			if(getBlocked(spell.getX()+1, spell.getY()) && checkImpassableElements(spell.getX()+1, spell.getY()))
			{
				moveElement(spell, 1, 0);
				
			}else{
				((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDLEFT);
			}
			break;
		case LAUNCHEDUP:
			
			if(getBlocked(spell.getX(), spell.getY()-1) && checkImpassableElements(spell.getX(), spell.getY()-1))
			{
				moveElement(spell, 0, -1);
				
			}else{
				((ISpell) spell).setSpellStatement(SpellStatement.LAUNCHEDDOWN);
			}
			break;
		default:
			break;
		
		}
		
		
}
	/**
	 * Checks collision between lorann and a loot
	 * 
	 */
	public void checkColisionLorannWithLoot()
	{
		IElement lorann = lorannGame.getLorannMap().getLorann();
		IElement element = lorannGame.getLorannMap().getElement(lorann.getX(), lorann.getY());
		if( element instanceof ILoot)
		{
			
			((ILorann)lorann).addScore(((ILoot)element).getPointsGiven());
			
			lorannGame.getLorannMap().destroyElement(lorann.getX(), lorann.getY());
			
		}
		if(element instanceof ICrystalBubble)
		{
			lorannGame.getLorannMap().openDoor();
		}
	}
	
	
	/**
	 * Checks collision between lorann and a door
	 * 
	 */
	
	public void checkColisionLorannWithDoor()
	{
		IElement lorann = lorannGame.getLorannMap().getLorann();
		IElement element = lorannGame.getLorannMap().getElement(lorann.getX(), lorann.getY());
		
		if(element instanceof IDoor)
		{
			if(((IDoor) element).getGateStatement() == GateStatement.LOCK)
			{
				
				die();
			}else if(((IDoor) element).getGateStatement() == GateStatement.OPEN)
			{
				
				win();
			}
		}
				
	}
	
	/**
	 * Checks collision between lorann and a monster
	 * 
	 */
	
	public void checkColisionLorannWithMonster()
	{		
		IElement lorann = lorannGame.getLorannMap().getLorann();
		for(IMonster monster : lorannGame.getLorannMap().getMonsters())
		{
			if(((IElement)monster).getX() == lorann.getX() && ((IElement)monster).getY() == lorann.getY())
			{
				
				
				die();
			}
		}	
	}
	
	/**
	 * Checks every collision with lorann
	 * 
	 */
	
	public void checkColisionLorann()
	{
		checkColisionLorannWithLoot();
		checkColisionLorannWithDoor();
		checkColisionLorannWithMonster();
	}
	
	/**
	 * Checks collision between a monster and lorann
	 * 
	 *  @param monster
	 *  	The monster that will check if it's in collision with lorann
	 */
	
	public void checkColisionMonsterWithLorann(IElement monster)
	{
		IElement lorann = lorannGame.getLorannMap().getLorann();
		if(monster.getX() == lorann.getX() && monster.getY() == lorann.getY())
		{
			
			die();
		}
	}
	
	/**
	 * Checks collision between a monster and a spell
	 * 
	 *  @param monster
	 *  	The monster that will check if it's in collision with lorann's spell
	 * 
	 *  @return boolean
	 *  	It's true if the monster and the spell are in the same position
	 */
	
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
	
	/**
	 * Checks if monster is to a position
	 * 
	 *  @param x
	 *  	The x position that you want to check if there is a monster
	 *  @param y
	 *  	The y position that you want to check if there is a monster
	 *  
	 *  @return boolean
	 *  	It's true when the monster is at the position
	 * 
	 */
	
	public boolean checkIfMonsterToPosition(final int x, final int y)
	{
		for(IMonster monster : lorannGame.getLorannMap().getMonsters())
		{
			if(((IElement)monster).getX() == x && ((IElement)monster).getY() == y)
			{
				
				return true;
			}
		}		
		return false;
	}
	
	/**
	 * Kills a monster when it is supposed to die
	 * 
	 */
	
	public void killMonster()
	{
		ArrayList<IMonster> monsters = lorannGame.getLorannMap().getMonsters();
		IElement spell = lorannGame.getLorannMap().getLorannSpell();
		
		for(int index = 0; index < monsters.size(); index++)
		{
			IElement monster = (IElement) monsters.get(index);
			if((monster).getX() == lorannGame.getLorannMap().getLorannSpell().getX() && (monster).getY() == lorannGame.getLorannMap().getLorannSpell().getY())
			{
				
				lorannGame.getLorannMap().removeMonsterByIndex(index);
				
				((ISpell) spell).setSpellStatement(SpellStatement.INPOCKET);
				
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
	

}

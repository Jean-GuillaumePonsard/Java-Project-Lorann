package controller;



import java.util.ArrayList;

import contract.ControllerOrder;
import contract.IController;
import contract.ILorannGame;
import contract.ILorannMap;
import contract.ILorannView;
import contract.IMonster;
import contract.IElement;
import contract.ILorann;
import contract.ILorannController;
import contract.IView;
import contract.LorannStatement;
import contract.Permeability;

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
			if(random <= .2d && getBlocked(((IElement)monster).getX(), ((IElement)monster).getY()-1)){
				moveElement((IElement)monster, 0, -1);
			}else if(random <= .4d && getBlocked(((IElement)monster).getX(), ((IElement)monster).getY()+1)){
				moveElement((IElement)monster, 0, +1);
			}else if(random <= .6d && getBlocked(((IElement)monster).getX()-1, ((IElement)monster).getY())){
				moveElement((IElement)monster, -1, 0);
			}else if(random <= .8d && getBlocked(((IElement)monster).getX()+1, ((IElement)monster).getY())){
				moveElement((IElement)monster, +1, 0);
			}			
		}
	}
	
	/*
	 * Launch Lorann's spell
	 * 
	 */
	public void launchSpell(){
		
	}
	
	/*
	 * kill Lorann when he touched a monster or a locked door
	 * 
	 */
	public void Die(){
		
		
	}
	
	/* (non-Javadoc)
	 * @see controller.ILorannController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(ControllerOrder controllerOrder) {
		IElement lorann = lorannGame.getLorannMap().getLorann();
		
		switch (controllerOrder){
		
			case UP:
				((ILorann) lorann).setLorannStatement(LorannStatement.UP);
				lorann.setImage("sprite/lorann_u.png");
				//this.view.printMessage("Up");
				if(getBlocked(lorann.getX(), lorann.getY()-1))
				{
					System.out.println("Move possible ^");
					moveElement(lorann, 0, -1);
				}	
				break;
				
			case DOWN:
				((ILorann) lorann).setLorannStatement(LorannStatement.DOWN);
				//this.view.printMessage("Down");
				lorann.setImage("sprite/lorann_b.png");
				if(getBlocked(lorann.getX(), lorann.getY()+1))
				{
					System.out.println("Move possible  v");
					moveElement(lorann, 0, +1);
				}	
				break;
				
			case LEFT:
				((ILorann) lorann).setLorannStatement(LorannStatement.LEFT);
				//this.view.printMessage("left");
				lorann.setImage("sprite/lorann_l.png");
				if(getBlocked(lorann.getX()-1, lorann.getY()))
				{
					System.out.println("Move possible <-");
					moveElement(lorann, -1, 0);
				}	
				break;
				
			case RIGHT:
				((ILorann) lorann).setLorannStatement(LorannStatement.RIGHT);
				//this.view.printMessage("Right");
				lorann.setImage("sprite/lorann_r.png");
				if(getBlocked(lorann.getX()+1, lorann.getY()))
				{
					System.out.println("Move possible ->");
					moveElement(lorann, +1, 0);
				}				
				break;
				
			case LAUNCHSPELL:
				//this.view.printMessage("Space");
				break;
			default:
				break;		
		}
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()
	 */
	public void control() {
		//this.view.printMessage("Appuyer sur les touches 'Z', 'UP', 'S', 'DOWN', 'Q', 'LEFT', 'RIGHT' ou 'D', pour afficher la direction choisit.");
	}
	
	public void callChange()
	{
		lorannGame.changeLorannGame();
	}

}

package controller;



import contract.ControllerOrder;
import contract.IController;
import contract.ILorannGame;
import contract.IElement;
import contract.ILorann;
import contract.IView;
import contract.LorannStatement;
import contract.Permeability;

//TODO: Auto-generated Javadoc
/**
* The Class Controller.
*/
public class LorannController implements IController {

	/** The view. */
	private IView		view;

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
	public LorannController(final IView view, final ILorannGame lorannGame) {
		this.setView(view);
		this.setModel(lorannGame);
	}
	/**
	 * Sets the view.
	 *
	 * @param view
	 *          the new view
	 */
	private void setView(final IView view) {
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
	 * Move Lorann
	 * 
	 * @param x
	 * @param y
	 */
	public void moveElement(IElement element, int x, int y){
				
		element.setX(element.getX()+x);
		element.setY(element.getY()+y);
		
		
	}
	/*
	 * (non-javadoc)
	 * 
	 */
	private boolean getBlocked(final int x, final int y){
		return getElement(x, y).getPermeability() == Permeability.PENETRABLE;
	}
	/*
	 * (non-javadoc)
	 *
	 */
	private IElement getElement(final int x, final int y)
	{
		return lorannGame.getLorannMap().getElement(x, y);
	}
	
	/*
	 * evite au monstre de rester bloquer contre un mur et le fait suivre Lorann
	 * 
	 */
	public void monsterAi(){
		//for (Monster m : model.)
	}
	
	/*
	 * Lance le sort de Lorann
	 * 
	 */
	public void launchSpell(){
		
	}
	
	/*
	 * Fait mourir Lorann si un monstre se trouve aux même coordonées que Lorann
	 * 
	 */
	public void Die(){
		
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(ControllerOrder controllerOrder) {
		IElement lorann = lorannGame.getLorannMap().getLorann();
		
		switch (controllerOrder){
		
			case UP:
				((ILorann) lorann).setLorannStatement(LorannStatement.UP);
				this.view.printMessage("Up");
				if(getBlocked(lorann.getX(), lorann.getY()-1))
				{
					System.out.println("Move possible ^");
					moveElement(lorann, 0, -1);
				}	
				break;
				
			case DOWN:
				((ILorann) lorann).setLorannStatement(LorannStatement.DOWN);
				this.view.printMessage("Down");
				if(getBlocked(lorann.getX(), lorann.getY()+1))
				{
					System.out.println("Move possible  v");
					moveElement(lorann, 0, +1);
				}	
				break;
				
			case LEFT:
				((ILorann) lorann).setLorannStatement(LorannStatement.LEFT);
				this.view.printMessage("left");
				if(getBlocked(lorann.getX()-1, lorann.getY()))
				{
					System.out.println("Move possible <-");
					moveElement(lorann, -1, 0);
				}	
				break;
				
			case RIGHT:
				((ILorann) lorann).setLorannStatement(LorannStatement.RIGHT);
				this.view.printMessage("Right");
				if(getBlocked(lorann.getX()+1, lorann.getY()))
				{
					System.out.println("Move possible ->");
					moveElement(lorann, +1, 0);
				}				
				break;
				
			case LAUNCHSPELL:
				this.view.printMessage("Space");
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
		this.view.printMessage("Appuyer sur les touches 'Z', 'UP', 'S', 'DOWN', 'Q', 'LEFT', 'RIGHT' ou 'D', pour afficher la direction choisit.");
	}

}

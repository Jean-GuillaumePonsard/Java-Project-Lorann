package controller;

import java.awt.event.KeyEvent;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

//TODO: Auto-generated Javadoc
/**
* The Class Controller.
*/
public class LorannController implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel		model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public LorannController(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
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
	private void setModel(final IModel model) {
		this.model = model;
	}
	
	/*
	 * appeler la méthode pour bouger Lorann en fonction de la touche utilisé
	 * 
	 * @see contract.Iview#keyPressed
	 */
	public void keyPressed(KeyEvent e){
		
	}
	
	/*
	 * (non-javadoc)
	 * 
	 */
	private boolean getBlocked(final int x, final int y){
		return false;
	}
	
	/*
	 * evite au monstre de rester bloquer contre un mur et le fait suivre Lorann
	 * 
	 */
	public void monsterAi(){
		
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
		// TODO Auto-generated method stub
		
	}
}

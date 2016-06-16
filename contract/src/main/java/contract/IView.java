package contract;

/**
 * The Interface IView.
 *
 * @author Franz Alliod
 */
public interface IView {

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 */
	void printMessage(final String message);

	/** sets controller
	 * 
	 * @param controller
	 */
public void setController (IController controller);

}

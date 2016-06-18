package contract;

public interface ILorann {

	/**
	 * Gets the lorannStatement.
	 *
	 * @return lorannStatement
	 */

	LorannStatement getLorannStatement();

	/**
	 * Sets the lorannStatement.
	 *
	 * @param lorannStatement
	 *          the new lorannStatement
	 */

	void setLorannStatement(LorannStatement lorannStatement);
	
	
	/** Gets the score
	 * 
	 * @return score
	 * 
	 * Lorann's score
	 */
	
	
	int getScore();
	
	
	/** Adds points to Lorann's score
	 * 
	 * @param score
	 * 	The points to add
	 */
	
	
	void addScore(int score);

}
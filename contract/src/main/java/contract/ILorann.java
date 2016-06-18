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
	 * 
	 */
	
	
	int getScore();
	
	
	/** Adds the score
	 * 
	 * @param score
	 */
	
	
	void addScore(int score);

}
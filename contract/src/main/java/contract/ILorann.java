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
	
	int getScore();
	
	void addScore(int score);

}
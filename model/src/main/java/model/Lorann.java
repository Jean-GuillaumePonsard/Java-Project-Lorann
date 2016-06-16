package model;

/**
 * The Class Lorann.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Lorann extends MotionElement {

	/** Lorann's Statement */
	private LorannStatement lorannStatement;
	
	/** 
	 *	Instantiates a new Lorann 
	 */
	
	public Lorann(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		/*setX(x);
		  setY(y);
		  lorannStatement = LorannStatement.UP*/
	}

	
	
	public LorannStatement getLorannStatement() {
		return lorannStatement;
	}

	/**
	 * Sets the lorannStatement.
	 *
	 * @param lorannStatement
	 *          the new lorannStatement
	 */
	
	public void setLorannStatement(LorannStatement lorannStatement) {
		this.lorannStatement = lorannStatement;
	}
	
}

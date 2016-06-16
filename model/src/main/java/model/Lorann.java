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
	 *	Instantiates a new Lorann.
	 * 
	 * @param x
	 * @param y
	 * @param url
	 */
	
	public Lorann(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
		lorannStatement = LorannStatement.UP;
	}

	/**
	 * Gets the lorannStatement.
	 *
	 * @return lorannStatement
	 */
	
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

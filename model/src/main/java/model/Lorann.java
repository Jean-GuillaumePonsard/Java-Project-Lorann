package model;

import contract.ILorann;
import contract.LorannStatement;
import contract.Permeability;

/**
 * The Class Lorann.
 *
 * @author Jean-Guillaume Ponsard
 */

public class Lorann extends MotionElement implements ILorann {

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

	/* (non-Javadoc)
	 * @see model.ILorann#getLorannStatement()
	 */
	
	public LorannStatement getLorannStatement() {
		return lorannStatement;
	}

	/* (non-Javadoc)
	 * @see model.ILorann#setLorannStatement(model.LorannStatement)
	 */
	
	public void setLorannStatement(LorannStatement lorannStatement) {
		this.lorannStatement = lorannStatement;
	}
	
}

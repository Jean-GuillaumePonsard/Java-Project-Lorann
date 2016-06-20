package model;

import contract.ILorann;
import contract.LorannStatement;
import contract.Permeability;

/**
 * The Class Lorann.
 *
 * @author Jean-Guillaume Ponsard
 * @version 16.06.2016
 */

public class Lorann extends MotionElement implements ILorann {

	/** Lorann's Statement */
	private LorannStatement lorannStatement;
	
	/** Lorann's score */
	private int score = 0;
	
	/** 
	 *	Instantiates a new Lorann.
	 * 
	 * @param x
	 * 	The x position of lorann
	 * @param y
	 * 	The y position of lorann
	 * @param url
	 * 	The path of the image
	 */
	
	public Lorann(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		setX(x);
		setY(y);
		lorannStatement = LorannStatement.UP;
		this.score = 0;
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
		modelChanged();
	}

	/*
	 * (non-Javadoc)
	 * @see contract.ILorann#getScore()
	 */
	public int getScore() {
		return score;
	}
	
	/*
	 * (non-Javadoc)
	 * @see contract.ILorann#addScore(int)
	 */

	public void addScore(int score) {
		this.score += score;
		modelChanged();
	}
	
}

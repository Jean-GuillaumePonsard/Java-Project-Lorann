package model;

public class Lorann extends MotionElement {

	private LorannStatement lorannStatement;
	
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

	public void setLorannStatement(LorannStatement lorannStatement) {
		this.lorannStatement = lorannStatement;
	}
	
}

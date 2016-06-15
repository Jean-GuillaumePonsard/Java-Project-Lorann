package model;

//Put the JavaDoc

public class Door extends MotionlessElement {

	public GateStatement gateStatement;
	
	public Door(int x, int y, String url)
	{
		super(url, Permeability.PENETRABLE);
		/*setX(x);
		setY(y);*/
	}
	
	public void setGateStatement(GateStatement gateStatement)
	{
		this.gateStatement = gateStatement;
	}
	
	public GateStatement getGateStatement()
	{
		return this.gateStatement;
	}
}

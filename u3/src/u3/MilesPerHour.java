package u3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setDt(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int d, int h, int m)
	{
		setDt(d, h, m);
		
	}

	public void setDt(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
	}

	public void calcMPH()
	{
		double timeTemp = (double)minutes/60 + hours;
		mph = (double)distance/timeTemp;
	}

	public void print()
	{
	}
	
	//create a print or toString or both
	//toString created
	
	public String toString()
	{
		return "mph " + String.format("%.4f", mph);
	}
}
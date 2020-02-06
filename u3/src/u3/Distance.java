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

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoords(0,0,0,0);
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoords(x1,y1,x2,y2);
	}

	public void setCoords(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		double x = Math.abs(xOne-xTwo);
		double y = Math.abs(yOne-yTwo);
		System.out.println("\n\nx:: " + x);
		System.out.println("y:: " + y);
		double inside = Math.pow(x, 2) + Math.pow(y, 2);
		double d = Math.pow(inside, .5);
		distance = d;
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return "dist " + String.format("%.3f", distance);
	}
}
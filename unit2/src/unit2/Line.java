package unit2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static float getSlope( int x1, int y1, int x2, int y2 )
	{
		if (x1>x2) {
			float slope = (float)(y1-y2)/(x1-x2);
			return slope;
		}
		else if (x2>x1) {
			float slope = (float)(y2-y1)/(x2-x1);
			return slope;
		}
		else {
			float infinity = 444444444;
			return infinity;
		}
	}

}
package u5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class AvgLen
{
   public static double go( String a, String b )
	{
		int aLen = a.length();
		int bLen = b.length();
		double avg = (double)(aLen + bLen)/2;
		return avg;
	}
}
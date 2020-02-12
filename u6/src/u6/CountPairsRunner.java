package u6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		System.out.println( CountPairs.pairCounter("test_cases") );
		//add in all of the provided test cases from the lab handout	
		String string = "ddogccatppig";
		System.out.print(CountPairs.pairCounter(string));
	}
}
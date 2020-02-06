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

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int d = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int h = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int m = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(d, h, m);
		test.calcMPH();
		System.out.println(test);
		
		//add more test cases
		
		MilesPerHour test2 = new MilesPerHour(45,0,32);
		test2.calcMPH();
		System.out.println("\n\n\n\ndistance:: 45");
		System.out.println("hours:: 0");
		System.out.println("minutes:: 32");
		System.out.println(test2);
		
		MilesPerHour test3 = new MilesPerHour(96,1,43);
		test3.calcMPH();
		System.out.println("\ndistance:: 96");
		System.out.println("hours:: 1");
		System.out.println("minutes:: 43");
		System.out.println(test3);
		
		MilesPerHour test4 = new MilesPerHour(4,4,4);
		test4.calcMPH();
		System.out.println("\ndistance:: 4");
		System.out.println("hours:: 4");
		System.out.println("minutes:: 4");
		System.out.println(test4);
		System.out.println("\nscroll up for input value MPH");
	}
}
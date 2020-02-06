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

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		Scanner keyboard = new Scanner(in);

		out.print("Enter x1 :: ");
		int x1 = keyboard.nextInt();

		out.print("Enter y1 ");
		int y1 = keyboard.nextInt();
		
		out.print("Enter x2 :: ");
		int x2 = keyboard.nextInt();
		
		out.print("Enter y2 ");
		int y2 = keyboard.nextInt();

		Distance test = new Distance(x1,y1,x2,y2);
		test.calcDistance();
		test.getDistance();
		System.out.println(test);
		
		Distance test2 = new Distance(1,1,2,1);
		test2.calcDistance();
		test2.getDistance();
		System.out.println("for (1, 1), (2, 1)");
		System.out.println(test2);
		
		Distance test3 = new Distance(1,90,-28,-61);
		test3.calcDistance();
		test3.getDistance();
		System.out.println("for (1, 90), (-28, -61)");
		System.out.println(test3);
		
		Distance test4 = new Distance(1,1,-2,2);
		test4.calcDistance();
		test4.getDistance();
		System.out.println("for (1, 1), (-2, 2)");
		System.out.println(test4);
		System.out.println("\nscroll up for input value dist");
		
	}
}
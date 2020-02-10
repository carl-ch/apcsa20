package u4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter an integer __");
		int Raymond = keyboard.nextInt();
		System.out.println(Raymond + " is odd :: " + NumberVerify.isOdd(Raymond));
		System.out.println(Raymond + " is even :: " + NumberVerify.isEven(Raymond));
		
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		System.out.print("Enter an integer __");
		int Raymond2 = keyboard.nextInt();
		System.out.println(Raymond2 + " is odd :: " + NumberVerify.isOdd(Raymond2));
		System.out.println(Raymond2 + " is even :: " + NumberVerify.isEven(Raymond2));
		
		System.out.print("Enter an integer __");
		int Raymond3 = keyboard.nextInt();
		System.out.println(Raymond3 + " is odd :: " + NumberVerify.isOdd(Raymond3));
		System.out.println(Raymond3 + " is even :: " + NumberVerify.isEven(Raymond3));
		
		//add in more test cases
		System.out.println("\n2000 is odd :: " + NumberVerify.isOdd(2000));
		System.out.println("2000 is even :: " + NumberVerify.isEven(2000));
		
		System.out.println("\n-99 is odd :: " + NumberVerify.isOdd(-99));
		System.out.println("-99 is even :: " + NumberVerify.isEven(-99));
		
		System.out.println("\n1111 is odd :: " + NumberVerify.isOdd(1111));
		System.out.println("1111 is even :: " + NumberVerify.isEven(1111));
		
		System.out.println("\n-850 is odd :: " + NumberVerify.isOdd(-850));
		System.out.println("-850 is even :: " + NumberVerify.isEven(-850));
	}
}
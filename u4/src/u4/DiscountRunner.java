package u4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.print("your true bill is " + Discount.getDiscountedBill(amt));
		
		out.print("\nEnter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		System.out.print("your true bill is " + Discount.getDiscountedBill(amt2));
		
		System.out.print("\nfor $500, your true bill is " + Discount.getDiscountedBill(500));
		System.out.print("\nfor $2500, your true bill is " + Discount.getDiscountedBill(2500));
		System.out.print("\nfor $4000, your true bill is " + Discount.getDiscountedBill(4000));
		System.out.print("\nfor $333.333, your true bill is " + Discount.getDiscountedBill(333.333));
		System.out.print("\nfor $95874.2154, your true bill is " + Discount.getDiscountedBill(95874.2154));
		System.out.print("\nfor $-500, you mistyped, did you mean " + Discount.getDiscountedBill(-500));

	}
}
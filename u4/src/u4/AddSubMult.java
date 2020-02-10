package u4;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if(a>b) {
			System.out.print("a>b ");
			return a-b;
		}
		else if(b>a) {
			System.out.print("b>a ");
			return b-a;
		}
		else {
			System.out.print("a=b ");
			return a*b;
		}
	}
}
package u11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord {
	// instance variables and constructors could be present, but are not necessary

	public static void printTriangle(String word) {
		int length = word.length();
		for (int i = 1; i <= length; i++) {
			for (int k = i; k >= 1; k--) {
				System.out.print(word.substring(0, i));
			}
			System.out.println();
		}
		System.out.println();
	}

}
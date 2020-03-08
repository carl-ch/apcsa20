package u11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner {
	public static void main(String args[]) {
		TriangleWord.printTriangle("a");
		TriangleWord.printTriangle("it");
		TriangleWord.printTriangle("box");
		TriangleWord.printTriangle("toad");
		TriangleWord.printTriangle("fishy");
		TriangleWord.printTriangle("dog");
		Scanner keyboard = new Scanner(System.in);
		String bool = "";
		while (bool.equals("Y") || bool.equals("y")) {
			System.out.print("\nEnter a word :: ");
			String word = keyboard.next();
			TriangleWord.printTriangle(word);
			System.out.print("\nDo you want to enter more sample inputs? ");
			bool = keyboard.next();
		}
	}
}
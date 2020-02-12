package u5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		String s1 = "hello"; String s2 = "goodbye";
		String s3 = "one"; String s4 = "two";
		String s5 = "three"; String s6 = "four";
		String s7 = "TCEA"; String s8 = "UIL";
		String s9 = "State"; String s10 = "Champion";
		String s11 = "ABC"; String s12 = "ABC";
		String s13 = "ABC"; String s14 = "CBA";
		String s15 = "Same"; String s16 = "Same";
		
		StringEquality tester = new StringEquality(s1, s2);
		tester.checkEquality();
		System.out.print(tester);
		
		tester.setWords(s3, s4);
		tester.checkEquality();
		System.out.print(tester);
		
		tester.setWords(s5, s6);
		tester.checkEquality();
		System.out.print(tester);
		
		tester.setWords(s7, s8);
		tester.checkEquality();
		System.out.print(tester);
		
		tester.setWords(s9, s10);
		tester.checkEquality();
		System.out.print(tester);
		
		tester.setWords(s11, s12);
		tester.checkEquality();
		System.out.print(tester);
		
		tester.setWords(s13, s14);
		tester.checkEquality();
		System.out.print(tester);
		
		tester.setWords(s15, s16);
		tester.checkEquality();
		System.out.print(tester);
	}
}
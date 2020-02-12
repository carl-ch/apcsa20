package u5;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   String s1 = "abe";
	   String s2 = "ape";
	   WordsCompare test1 = new WordsCompare(s1, s2);
	   test1.compare();
	   System.out.println(test1);

	   String s3 = "giraffe";
	   String s4 = "gorilla";
	   WordsCompare test2 = new WordsCompare(s3, s4);
	   test2.compare();
	   test2.toString();
	   System.out.println(test2);
	   
	   String s5 = "one";
	   String s6 = "two";
	   WordsCompare test3 = new WordsCompare(s5, s6);
	   test3.compare();
	   test3.toString();
	   System.out.println(test3);
	   
	   String s7 = "123";
	   String s8 = "19";
	   WordsCompare test4 = new WordsCompare(s7, s8);
	   test4.compare();
	   test4.toString();
	   System.out.println(test4);
	   
	   String s9 = "193";
	   String s10 = "1910";
	   WordsCompare test5 = new WordsCompare(s9, s10);
	   test5.compare();
	   test5.toString();
	   System.out.println(test5);
	   
	   String s11 = "goofy";
	   String s12 = "godfather";
	   WordsCompare test6 = new WordsCompare(s11, s12);
	   test6.compare();
	   test6.toString();
	   System.out.println(test6);
	   
	   String s13 = "funnel";
	   String s14 = "fun";
	   WordsCompare test7 = new WordsCompare(s13, s14);
	   test7.compare();
	   test7.toString();
	   System.out.println(test7);
	   
	   String s15 = "fun";
	   String s16 = "funny";
	   WordsCompare test8 = new WordsCompare(s15, s16);
	   test8.compare();
	   test8.toString();
	   System.out.println(test8);
	}
}
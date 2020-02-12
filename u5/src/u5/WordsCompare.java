package u5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
    private int ezClap;

	public WordsCompare()
	{
	}

	public WordsCompare(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare()
	{
		ezClap = wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		if(ezClap<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
			
		}
	}
}
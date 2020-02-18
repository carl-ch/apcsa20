package u6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		setString("");
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		char firstChar = word.charAt(0);
		return firstChar;
	}

	public char getLastChar()
	{
		char lastChar = word.charAt(word.length()-1);
		return lastChar;
	}

	public String getBackwards()
	{
		String back="";
		for(int i=(word.length()-1);i>=0;i--) {
			back += word.substring(i, i+1);
		}
		return back;
	}

 	public String toString()
 	{
 		return word + "\n" + getFirstChar() + "\n" + getLastChar() + "\n" + getBackwards() + "\n";
	}
}
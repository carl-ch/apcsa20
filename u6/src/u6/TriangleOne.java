package u6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word=s;
	}

	public void print( )
	{
		int length = word.length();
		for(int n=0;n<word.length();n++) {
			System.out.println(word.substring(0, length));
			length--;
		}
	}
}
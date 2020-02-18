package u6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word wShell = new Word("Hello");
		wShell.getFirstChar();
		wShell.getLastChar();
		wShell.getBackwards();
		System.out.println(wShell);
		
		wShell.setString("World");
		wShell.getFirstChar();
		wShell.getLastChar();
		wShell.getBackwards();
		System.out.println(wShell);
		
		wShell.setString("JukeBox");
		wShell.getFirstChar();
		wShell.getLastChar();
		wShell.getBackwards();
		System.out.println(wShell);
		
		wShell.setString("TCEA");
		wShell.getFirstChar();
		wShell.getLastChar();
		wShell.getBackwards();
		System.out.println(wShell);
		
		wShell.setString("UIL");
		wShell.getFirstChar();
		wShell.getLastChar();
		wShell.getBackwards();
		System.out.println(wShell);
		
		wShell.setString("c gnuy");
		wShell.getFirstChar();
		wShell.getLastChar();
		wShell.getBackwards();
		System.out.println(wShell);
		
	}
}
package u5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String aFirst = a.substring(0,1);
	   String aLast = a.substring(a.length()-1);
	   if ((aFirst.equalsIgnoreCase("a")) || (aLast.equalsIgnoreCase("a")) || 
			   (aLast.equalsIgnoreCase("e")) || (aLast.equalsIgnoreCase("e")) || 
			   (aLast.equalsIgnoreCase("i")) || (aLast.equalsIgnoreCase("i")) || 
			   (aLast.equalsIgnoreCase("o")) || (aLast.equalsIgnoreCase("o")) || 
			   (aLast.equalsIgnoreCase("u")) || (aLast.equalsIgnoreCase("u"))) {
	   	return "y";
	   }
	   else {
		   return "n";
	   }
	}
}
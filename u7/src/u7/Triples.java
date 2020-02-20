package u7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{

		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
		
	}
	
	private static int greatestCommonFactor(int a, int b, int c)
	{
		
		int d = 1;
		int e = 1;
		int f = 1;
		for(int i4=0; i4<=a;i4++) {
			
		}
	}
	
	private String pyTheorem(int a, int b, int c) {
		int max = number;
		a=1;b=1;c=1;
		for(int i=0;i<=max;i++) {
			if((Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)) && (greatestCommonFactor(a,b,c)==1)) {
				System.out.println(a + " " + b + " " + c + " ");
				b=1;
				c++;
			}
			for(int i2=0;i2<=max;i++) {
				if((Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)) && (greatestCommonFactor(a,b,c)==1)) {
					System.out.println(a + " " + b + " " + c + " ");
					a=1;
					b++;
				}
				for(int i3=0;i3<=max;i++) {
					if((Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)) && (greatestCommonFactor(a,b,c)==1)) {
						System.out.println(a + " " + b + " " + c + " ");
						a++;
					}
				}
			}
		}
	}

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}
package u6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private boolean result;
   
	public Perfect() {
		number = 0;
	}
	public Perfect(int n) {
		number = n;
	}

	public boolean isPerfect()
	{
		int i = 1;
		int total = 0;
		while(i<number) {
			if(number % i == 0) {
				total += i;
			}
			i++;
		}
		if(total==number) {
			result=true;
			return result;
		}
		else {
			result=false;
			return result;
		}
	}
	public String toString() {
		if(result==true) {
			return + number + " is perfect";
		}
		else {
			return + number + " is not perfect";
		}
	}
	//add a toString	
	
}
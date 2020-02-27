package u9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		int a;
		int b;
		if(numArray.size()<=1) {
			return false;
		}
		else {
			for(int i=0; i<numArray.size()-1; i++) {
				a = numArray.get(i);
				b = numArray.get(i+1);
				if(b>=a) {
					return false;
				}
			}
		}
		return true;
	}	
}
package u9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int curr = 0;
		int curr2 = 0;
		int first = -1;
		int second = -1;
		for(int i = 0; i<ray.size(); i++) {
			curr = ray.get(i);
			if(curr % 2 == 1) {
				first = ray.get(i);
				for(int i2 = ray.size()-1;i2>=0;i2--) {
					curr2 = ray.get(i2);
					if(curr2 % 2 == 0) {
						second = ray.get(i2);
						return second-first;
					}
				}
			}
		}
	}
}
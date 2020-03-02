package u9;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst {
	public static int go(List<Integer> ray) {
		int a;
		int b;
		int count = 0;
		for (int i = 0; i < ray.size(); i++) {
			a = ray.get(0);
			b = ray.get(i);
			if (b > a) {
				count += b;
			}
		}
		if (count == 0) {
			--count;
		}
		return count;
	}
}
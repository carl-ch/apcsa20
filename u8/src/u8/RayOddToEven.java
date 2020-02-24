package u8;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven {
	public static String go(int[] ray) {
		int first = -1;
		int second = -1;
		int diff = -1;
		int c = 0;
		for (int i = 0; i <= ray.length - 1; i++) {
			if (ray[i] % 2 == 1) {
				first = i;
				c = first;
				if (first != -1) {
					i = ray.length;
				}
				while ((second == -1) && (c < ray.length - 1)) {
					if (ray[c] % 2 == 0) {
						second = c;
					}
					c++;
				}
			}
		}
		diff = second - first;
		return first + " " + second + " " + diff;
	}
}
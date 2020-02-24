package u8;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast {
	public static int go(int[] ray) {
		int tot = 0;
		if (ray.length <= 1) {
			tot = -1;
		} else {
			int last = ray[ray.length - 1];
			for (int i = 0; i <= ray.length - 2; i++) {
				if (ray[i] > last) {
					tot += ray[i];
				}
			}
		}
		if (tot == 0) {
			tot--;
		}
		return tot;
	}
}
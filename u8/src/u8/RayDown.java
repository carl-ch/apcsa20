package u8;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class RayDown {
	// go() will return true if all numbers in numArray
	// are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray) {
		boolean bool = true;
		for (int i = 0; i < numArray.length - 1; i++) {
			if (numArray[i] <= numArray[i + 1]) {
				bool = false;
			} else if (numArray[numArray.length - 1] >= numArray[i]) {
				bool = false;
			}
		}
		return bool;
	}
}
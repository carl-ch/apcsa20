package u6;
//(c) A+ Computer Science


import static java.lang.System.*;

public class CountPairs {
	public static int pairCounter(String str) {
		int count = 0;
		for (int i = 1; i <= str.length() - 1; i++) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				count += 1;
			}
		}
		return count;
	}
}
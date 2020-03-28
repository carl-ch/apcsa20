package u13;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter {
	// instance variables and other methods
	int[] sorted;

	private static int getNumDigits(int number) {
		int count = 0;
		do {
			number /= 10;
			count++;
		} while (number > 0);
		return count;
	}

	public static int[] getSortedDigitArray(int number) {
		int[] initRay = new int[getNumDigits(number)];
		int i = 0;
		while (number > 0) {
			initRay[i] = number % 10;
			number /= 10;
			i++;
		}
		int[] sorted = initRay;
		for (int k = 1; k < sorted.length; k++) {
			int temp = sorted[k];
			int k2 = k;
			while (k2 > 0 && k2 < sorted[k2 - 1]) {
				sorted[k2] = sorted[k2 - 1];
				k2--;
			}
			sorted[k2] = temp;
		}
		return sorted;
	}
}
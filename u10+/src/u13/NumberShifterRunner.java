package u13;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner {
	public static void main(String args[]) throws IOException {
		int[] arr = NumberShifter.makeLucky7Array(40);
		System.out.println(Arrays.toString(arr));
		NumberShifter.shiftEm(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();

		int[] arr1 = NumberShifter.makeLucky7Array(40);
		System.out.println(Arrays.toString(arr1));
		NumberShifter.shiftEm(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println();

		int[] arr2 = NumberShifter.makeLucky7Array(40);
		System.out.println(Arrays.toString(arr2));
		NumberShifter.shiftEm(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println();
	}
}

package u13;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo {
	private String[] wordRay;

	public WordSortTwo(String sentence) {
		wordRay = sentence.split(" ");
	}

	public void sort() {
		for (int i = 1; i < wordRay.length; i++) {
			String temp = wordRay[i];
			int i2 = i;
			while (i2 > 0 && temp.compareTo(wordRay[i2 - 1]) < 0) {
				wordRay[i2] = wordRay[i2 - 1];
				i2--;
			}
			wordRay[i2] = temp;
		}
	}

	public String toString() {
		String output = "";
		for (int k = 0; k < wordRay.length; k++) {
			output += wordRay[k] + "\n";
		}
		return output + "\n\n";
	}
}
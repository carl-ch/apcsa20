package u7;
//(c) A+ Computer Science

// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples {
	private int number;

	public Triples() {
		this(0);
	}

	public Triples(int num) {
		setNum(num);

	}

	public void setNum(int num) {
		number = num;

	}

	private String pyTheoremString() {
		String output = "";
		for (int i = 1; i < number; i++) {
			for (int j = i; j < number; j++) {
				for (int k = j; k < number; k++) {
					if (pyTheorem(i, j, k) && ifOddEven(i, j, k) && greatestCommonFactor(i, j, k) == 1)
						output = output + i + " " + j + " " + k + "\n";
				}
			}
		}
		return output;
	}

	private boolean pyTheorem(int i, int j, int k) {
		if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2))
			return true;
		else
			return false;
	}

	private boolean ifOddEven(int i, int j, int k) {
		if (k % 2 == 0)
			return false;
		if ((j % 2 != 0) && (i % 2 == 0) || (j % 2 == 0) && (i % 2 != 0))
			return true;
		else
			return false;
	}

	private int greatestCommonFactor(int a, int b, int c) {
		int max = 0;
		for (int i2 = 1; i2 < number; i2++) {
			if ((a % i2 == 0) && (b % i2 == 0) && (c % i2 == 0)) {
				max = i2;
			}
		}
		return max;
	}

	public String toString() {
		String output = "";

		output = pyTheoremString();

		return output + "\n";
	}
}
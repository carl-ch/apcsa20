package u7;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive {
	private char letter;
	private int amount;

	public TriangleFive() {
		setLetter('a');
		setAmount(0);
	}

	public TriangleFive(char c, int amt) {
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c) {
		letter = c;
	}

	public void setAmount(int amt) {
		amount = amt;
	}

	private String nestedLoop() {
		int i;
		int j;
		int c;
		char l = letter;
		String current = "";
		int currentAscii = (int) letter;

		for (c = amount; c > 0; c--) {
			for (i = c; i > 0; i--) {
				for (j = c; j > 0; j--) {
					current = current + l;
				}
				current = current + "\n";
			}
			if (currentAscii >= 90) {
				currentAscii = 65;
			} else {
				currentAscii++;
			}
			l = (char) currentAscii;
		}
		return current;
	}

	public String toString() {
		String output = "";

		output = nestedLoop();

		return output;
	}
}
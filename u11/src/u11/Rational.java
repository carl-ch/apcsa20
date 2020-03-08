package u11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	// add two instance variables
	private int numer;
	private int denomer;

	// write two constructors
	public Rational() {
		numer = 0;
		denomer = 1;
	}

	public Rational(int num1, int num2) {
		setRational(num1, num2);
	}

	// write a setRational method
	public void setRational(int num1, int num2) {
		numer = num1;
		denomer = num2;
	}

	// write a set method for numerator and denominator
	public void setNumerator(int num) {
		numer = num;
	}

	public void setDenominator(int num) {
		denomer = num;
	}

	public void add(Rational other) {
		// num1/den1 + num2/den2
		// new numerator = (num1 * den2 + num2 * den1)
		// new denominator = (den1 * den2)

		numer = numer * other.denomer + other.numer * denomer;
		denomer = denomer * other.denomer;

		reduce();
	}

	private void reduce() {
		int currDiv = gcd(numer, denomer);
		while (gcd(numer, denomer) != 1) {
			numer /= currDiv;
			denomer /= currDiv;
			currDiv = gcd(numer, denomer);
		}
	}

	private int gcd(int num1, int num2) {

		int min = Math.min(num1, num2);
		for (int i = min; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return 1;
	}

	public Object clone() {
		Rational clone = new Rational(numer, denomer);
		return clone;
	}

	// ACCESSORS

	// write get methods for numerator and denominator
	public int getNu() {
		return numer;
	}

	public int getDe() {
		return denomer;
	}

	public boolean equals(Object obj) {
		Rational temp = (Rational) obj;
		temp.reduce();
		reduce();
		if (numer == temp.numer && denomer == temp.denomer) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other) {
		int compare1 = getNu()*other.denomer;
		int compare2 = getDe()*other.numer;
		if(compare1>compare2) {
			return 1;
		}
		else if(compare1==compare2) {
			return 0;
		}
		else if(compare1<compare2) {
			return -1;
		}
		return -2;
	}

	// write toString() method
	public String toString() {
		String o;
		o = numer + "/" + denomer;
		return o;
	}

}
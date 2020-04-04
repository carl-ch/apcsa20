package pcLab;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Setup {
	private Pc[] computerList;

	public Setup() {
		computerList = new Pc[0];
	}

	public Setup(int amount) {
		computerList = new Pc[amount];
	}

	public void addComputer(int index, Pc comp) {
		computerList[index] = comp;
	}

	public int getSetupLength() {
		return computerList.length;
	}

	public double getSetupAverage() {
		double setupSum = 0;
		for (Pc k : computerList) {
			setupSum += k.getAverage();
		}
		double classAverage = setupSum / computerList.length;
		return classAverage;
	}

	public String getPcName(int index) {
		Pc out = null;
		if (index < computerList.length) {
			out = computerList[index];
			return out.getName();
		} else {
			return "";
		}
	}

	public Pc getPc(String nm) {
		Pc out = null;
		for (Pc k : computerList) {
			if (k.getName().equals(nm)) {
				out = k;
			}
		}
		return out;
	}

	public double getPcAverage(String nm) {
		Pc out = null;
		for (Pc k : computerList) {
			if (k.getName().equals(nm)) {
				out = k;
			}
		}
		if (out == null)
			return 0.0;
		return out.getAverage();
	}

	public String getPcMaxHz() {
		Pc out = null;
		double hz = Double.MIN_VALUE;
		for (Pc k : computerList) {
			if (k.getHz() > hz) {
				out = k;
				hz = k.getHz();
			}
		}
		String hName = out.getName();
		return hName;
	}

	public String getPcMinHz() {
		Pc out = null;
		double hz = Double.MAX_VALUE;
		for (Pc k : computerList) {
			if (k.getHz() < hz) {
				out = k;
				hz = k.getHz();
			}
		}
		String hName = out.getName();
		return hName;
	}

	public String comparePc(String nm, String nm2) {
		Pc out = null;
		Pc outLess = null;
		Pc comp = getPc(nm);
		Pc comp2 = getPc(nm2);
		if (comp.getHz() > comp2.getHz()) {
			out = comp;
			outLess = comp2;
		} else if (comp.getHz() < comp2.getHz()) {
			out = comp2;
			outLess = comp;
		} else {
			return "the two computers' clocks are equal";
		}
		return out.getName() + " has a higher clock than " + outLess.getName();
	}

	public void sortPc() {
		Pc tempC;

		for (int i = 0; i < computerList.length; i++) {
			for (int j = i + 1; j < computerList.length; j++) {
				if (computerList[i].getHz() > computerList[j].getHz()) {
					tempC = computerList[i];
					computerList[i] = computerList[j];
					computerList[j] = tempC;
				}
			}
		}
	}

	public Pc binaryPc(int i, int i2, double find) {
		if (i2 > 0) {
			int mid = 1 + (i2 - 1) / 2;
			if (computerList[mid].getHz() == find) {
				return computerList[mid];
			}
			if (computerList[mid].getHz() > find) {
				return binaryPc(i, mid - 1, find);
			} else {
				return binaryPc(mid + 1, i2, find);
			}
		}
		return null;
	}

	public String toString() {
		String output = "";
		for (Pc k : computerList) {
			output += "name: " + k.getName() + "\n" + k.getBench().toString() + "\n";
		}
		return output;
	}
}
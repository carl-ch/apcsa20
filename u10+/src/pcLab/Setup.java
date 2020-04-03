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

	public double getSetupAverage() {
		double setupSum = 0;
		for (Pc k : computerList) {
			setupSum += k.getAverage();
		}
		double classAverage = setupSum / computerList.length;

		return classAverage;
	}

	public double getStudentAverage(int stuNum) {
		return 0.0;
	}

	public double getStudentAverage(String stuName) {

		return 0.0;
	}

	public String getStudentName(int stuNum) {
		return "";
	}

	public String getStudentWithHighestAverage() {
		double high = Double.MIN_VALUE;
		String hName = "";

		return hName;
	}

	public String getStudentWithLowestAverage() {
		double low = Double.MAX_VALUE;
		String hName = "";

		return hName;
	}

	public String getFailureList(double failingGrade) {
		String output = "";

		return output;
	}

	public String toString() {
		String output = "" + "\n";

		return output;
	}
}
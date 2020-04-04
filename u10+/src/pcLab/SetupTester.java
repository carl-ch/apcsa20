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

public class SetupTester {
	public static void main(String args[]) {
		Setup test = new Setup(3);
		test.addComputer(0, new Pc("Ibuypower", 4, 9, 6));
		test.addComputer(1, new Pc("Cyberpower", 1, 2, 3));
		test.addComputer(2, new Pc("XoticPC", 2.5, 2.5, 3.5));
		out.println(test);

		out.println(String.format(test.getPcName(0) + "\'s average = %.2f", test.getPcAverage(test.getPcName(0))));
		out.println(String.format(test.getPcName(1) + "\'s average = %.2f", test.getPcAverage(test.getPcName(1))));
		out.println(String.format(test.getPcName(2) + "\'s average = %.2f", test.getPcAverage(test.getPcName(2))));

		out.println("Highest Clocks = " + test.getPcMaxHz());
		out.println("Lowest Clocks = " + test.getPcMinHz());

		out.println(String.format("Average Clocks in Setup = %.2f", test.getSetupAverage()));
	}
}
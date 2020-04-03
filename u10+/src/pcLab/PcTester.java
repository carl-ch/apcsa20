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

public class PcTester {
	public static void main(String args[]) {
		Pc comp = new Pc("Billy Bob", 5.0, 4.0, 1.0);
		out.println(comp);
		out.println("overall hz = " + comp.getHz());
		out.print("average hz = ");
		out.format("%.3f", comp.getAverage());
	}
}
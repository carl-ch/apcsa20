package pcLab;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;

import u13.WordSortTwo;

import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class LANPartyRunner {
	public static void main(String args[]) throws Exception {
		out.println("Welcome to the Setup Benchmark program!");

		Scanner file = new Scanner(new File("src/LANParty.dat"));
		file.useDelimiter(",");
		int size = new Integer(file.nextLine());
		Setup lan = new Setup(size);
//		file.nextLine();

		int k = 0;
		while (file.hasNextLine()) {
			String ln = file.nextLine();
			String[] ray = ln.split(",");
			String nm = ray[0];
			double gpu = new Double(ray[1]);
			double cpu = new Double(ray[2]);
			double mem = new Double(ray[3]);

			Pc comp = new Pc(nm, gpu, cpu, mem);
			lan.addComputer(k, comp);
			k++;
		}
		out.println(lan);
		out.println("Index 0's Average Bench: " + lan.getPcAverage(lan.getPcName(0)));
		out.println("Compare test: " + lan.comparePc(lan.getPcName(0), lan.getPcName(4)));
		out.println("Average Bench of all PCs: " + lan.getSetupAverage());
		out.println("Max clock goes to: " + lan.getPcMaxHz());
		out.println("Min clock goes to: " + lan.getPcMinHz());

	}
}
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

public class Pc {
	private String name;
	private Benchmark stats;
	private double hz;
	private double avg;

	public Pc() {
		setName("");
		setBench(0.0, 0.0, 0.0);
		setHz();
		setAverage();
	}

	public Pc(String nm, double gpu, double cpu, double memory) {
		setName(nm);
		setBench(gpu, cpu, memory);
		setHz();
		setAverage();
	}

	public void setName(String nm) {
		name = nm;
	}

	public void setBench(double gpu, double cpu, double memory) {
		stats = new Benchmark(gpu, cpu, memory);
	}

	public String getName() {
		return name;
	}

	public void setHz() {
		hz = stats.getOverall();
	}
	
	public void setAverage() {
		avg = stats.getAvg();
	}
	
	public double getHz() {
		return hz;
	}
	
	public double getAverage() {
		return avg;
	}

	public Benchmark getBench() {
		return stats;
	}

	public String toString() {
		String output = "";
		output = "pc performed at efficacy:\n" + stats;
		return output;
	}
}
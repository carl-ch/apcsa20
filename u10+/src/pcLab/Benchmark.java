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

public class Benchmark {
//	clocks in unit GHz
	private double GPUClock;
	private double CPUClock;
	private double MemoryClock;

	public Benchmark() {
		setCPU(0.0);
		setGPU(0.0);
		setMemory(0.0);
	}

	public Benchmark(double gpu, double cpu, double memory) {
		setCPU(cpu);
		setGPU(gpu);
		setMemory(memory);
	}

	public void setGPU(double gpu) {
		GPUClock = gpu;
	}

	public void setCPU(double cpu) {
		CPUClock = cpu;
	}

	public void setMemory(double memory) {
		MemoryClock = memory;
	}

	public double getOverall() {
		double sum = GPUClock + CPUClock + MemoryClock;
		return sum;
	}
	
	public double getAvg() {
		double avg = getOverall();
		avg /= 3;
		return avg;
	}

	public String toString() {
		String output = "";
		output = "gpu clock: " + GPUClock + "GHz;\n" + "cpu clock: " + CPUClock + "GHz;\n" + "memory clock: " + MemoryClock + "GHz;\n";
		return output;
	}
}
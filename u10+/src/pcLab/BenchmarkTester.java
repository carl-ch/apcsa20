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

public class BenchmarkTester
{
   public static void main( String args[] )
   {
		Benchmark test = new Benchmark(1.0, 2.0, 3.0);
		out.println(test);
		out.println("sum = " + test.getOverall());
		out.println("avg = " + test.getAvg());
	}		
}
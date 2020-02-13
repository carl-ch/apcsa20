package u6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect n = new Perfect(496);
		n.isPerfect();
		System.out.println(n);
		Perfect n2 = new Perfect(45);
		n2.isPerfect();
		System.out.println(n2);
		Perfect n3 = new Perfect(6);
		n3.isPerfect();
		System.out.println(n3);
		Perfect n4 = new Perfect(14);
		n4.isPerfect();
		System.out.println(n4);
		Perfect n5 = new Perfect(8128);
		n5.isPerfect();
		System.out.println(n5);
		Perfect n6 = new Perfect(1245);
		n6.isPerfect();
		System.out.println(n6);
		Perfect n7 = new Perfect(33);
		n7.isPerfect();
		System.out.println(n7);
		Perfect n8 = new Perfect(28);
		n8.isPerfect();
		System.out.println(n8);
		Perfect n9 = new Perfect(27);
		n9.isPerfect();
		System.out.println(n9);
		Perfect n10 = new Perfect(33550336);
		n10.isPerfect();
		System.out.println(n10);
																
	}
}
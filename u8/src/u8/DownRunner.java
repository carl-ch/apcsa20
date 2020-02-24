package u8;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class DownRunner {
	public static void main(String args[]) {
		int[] arr = new int[12];
		arr[0] = -99;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		arr[5] = 5;
		arr[6] = 6;
		arr[7] = 7;
		arr[8] = 8;
		arr[9] = 9;
		arr[10] = 10;
		arr[11] = 5;
		System.out.println("Data #1 " + RayDown.go(arr) + "\n");

		arr = new int[11];
		arr[0] = 10;
		arr[1] = 9;
		arr[2] = 8;
		arr[3] = 7;
		arr[4] = 6;
		arr[5] = 5;
		arr[6] = 4;
		arr[7] = 3;
		arr[8] = 2;
		arr[9] = 1;
		arr[10] = -99;
		System.out.println("Data #2 " + RayDown.go(arr) + "\n");

		arr = new int[6];
		arr[0] = 9;
		arr[1] = 10;
		arr[2] = -88;
		arr[3] = 100;
		arr[4] = -555;
		arr[5] = 2;
		System.out.println("Data #6 " + RayDown.go(arr) + "\n");

		arr = new int[5];
		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 10;
		arr[3] = 11;
		arr[4] = 456;
		System.out.println("Data #7 " + RayDown.go(arr) + "\n");

		arr = new int[1];
		arr[0] = 32767;
		System.out.println("Data #4 " + RayDown.go(arr) + "\n");

		arr = new int[2];
		arr[0] = 255;
		arr[1] = 255;
		System.out.println("Data #5 " + RayDown.go(arr) + "\n");

		arr = new int[6];
		arr[0] = 9;
		arr[1] = 10;
		arr[2] = -8;
		arr[3] = 10000;
		arr[4] = -5000;
		arr[5] = -3000;
		System.out.println("Data #12 " + RayDown.go(arr) + "\n");

		arr = new int[13];
		arr[0] = 250;
		arr[1] = 19;
		arr[2] = 17;
		arr[3] = 15;
		arr[4] = 13;
		arr[5] = 11;
		arr[6] = 10;
		arr[7] = 9;
		arr[8] = 6;
		arr[9] = 3;
		arr[10] = 2;
		arr[11] = 1;
		arr[12] = -455;
		System.out.println("Data #11 " + RayDown.go(arr) + "\n");
	}
}
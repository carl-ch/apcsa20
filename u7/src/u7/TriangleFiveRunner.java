package u7;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner {
	public static void main(String args[]) {
		TriangleFive t = new TriangleFive('C', 4);
		System.out.println(t);

		t.setLetter('A');
		t.setAmount(5);
		System.out.println(t);

		t.setLetter('B');
		t.setAmount(7);
		System.out.println(t);

		t.setLetter('X');
		t.setAmount(6);
		System.out.println(t);

		t.setLetter('Z');
		t.setAmount(8);
		System.out.println(t);
	}
}
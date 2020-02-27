package u7;
//(c) A+ Computer Science

// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		char response;

		// add in a do while loop after you get the basics up and running

		String player = "";

		out.print("pick rock, paper, scissors (capital letters only) [R,P,S] :: ");

		// read in the player value

		response = keyboard.next().charAt(0);
		String rString = response + "";
		RockPaperScissors game = new RockPaperScissors(rString);

		out.print(game);
	}
}

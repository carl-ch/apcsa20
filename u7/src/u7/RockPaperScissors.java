package u7;
//(c) A+ Computer Science

// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors {
	private String playChoice;
	private String compChoice;

	public RockPaperScissors() {
		setPlayers("R");
	}

	public RockPaperScissors(String player) {
		setPlayers(player);
	}

	public void setPlayers(String player) {
		playChoice = player;
		int comp = (int) (Math.random() * 3);
		if (comp < 1) {
			compChoice = "R";
		} else if (comp > 1) {
			compChoice = "S";
		} else {
			compChoice = "P";
		}
	}

	public String determineWinner() {
		char pChar = playChoice.charAt(0);
		char cChar = compChoice.charAt(0);
		String winner = "";

		if (cChar == pChar) {
			winner = "no one";
		} else if (cChar == 'P' && pChar == 'R') {
			winner = "computer";
		} else if (cChar == 'R' && pChar == 'P') {
			winner = "player";
		} else if (cChar == 'S' && pChar == 'R') {
			winner = "player";
		} else if (cChar == 'R' && pChar == 'S') {
			winner = "computer";
		} else if (cChar == 'P' && pChar == 'S') {
			winner = "player";
		} else if (cChar == 'S' && pChar == 'P') {
			winner = "computer";
		}
		return winner;
	}

	public String toString() {
		String output = "";
		output = determineWinner();
		return "player had " + playChoice + "\n" + "comp had " + compChoice + "\n" + output + " wins gg\n";
	}
}
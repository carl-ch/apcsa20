package u13;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*;

public class WordSearch {
	private String[][] m;

	public WordSearch(int size, String str) {
		m = new String[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				m[i][j] = str.charAt(8 * i + j) + "";
			}
		}
	}

	public boolean isFound(String word) {
		String chara = word.charAt(0) + "";
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				if (m[r][c].equals(chara)) {

					if (c + word.length() < m[0].length + 1) {
						if (checkRight(word, r, c)) {
							return true;
						}
					}

					if (c - word.length() >= -1) {
						if (checkLeft(word, r, c)) {
							return true;
						}
					}

					if (r - word.length() >= -1) {
						if (checkUp(word, r, c)) {
							return true;
						}
					}

					if (r + word.length() < m.length + 1) {
						if (checkDown(word, r, c)) {
							return true;
						}
					}

					if (r - word.length() >= -1 && c + word.length() < m[0].length + 1) {
						if (checkDiagUpRight(word, r, c)) {
							return true;
						}
					}

					if (r - word.length() >= -1 && c - word.length() >= -1) {
						if (checkDiagUpLeft(word, r, c)) {
							return true;
						}
					}

					if (r + word.length() < m.length + 1 && c - word.length() >= -1) {
						if (checkDiagDownLeft(word, r, c)) {
							return true;
						}
					}

					else if (r + word.length() < m.length + 1 && c + word.length() < m[0].length + 1) {
						if (checkDiagDownRight(word, r, c)) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}

	public boolean checkRight(String w, int r, int c) {
		for (int i = 1; i < w.length(); i++) {
			if (!(w.charAt(i) + "").equals(m[r][c + i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c) {
		for (int i = 1; i < w.length(); i++) {
			if (!(w.charAt(i) + "").equals(m[r][c - i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c) {
		for (int i = 1; i < w.length(); i++) {
			if (!(w.charAt(i) + "").equals(m[r - i][c])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c) {
		for (int i = 1; i < w.length(); i++) {
			if (!(w.charAt(i) + "").equals(m[r + i][c])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c) {
		for (int i = 1; i < w.length(); i++) {
			if (!(w.charAt(i) + "").equals(m[r - i][c + i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c) {
		for (int i = 1; i < w.length(); i++) {
			if (!(w.charAt(i) + "").equals(m[r - i][c - i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c) {
		for (int i = 1; i < w.length(); i++) {
			if (!(w.charAt(i) + "").equals(m[r + i][c - i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c) {
		for (int i = 1; i < w.length(); i++) {
			if (!(w.charAt(i) + "").equals(m[r + i][c + i])) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		return "";
	}
}

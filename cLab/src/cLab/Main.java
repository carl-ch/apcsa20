package cLab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		System.out.println(Review.sentimentVal("happy"));
		System.out.println(Review.sentimentVal("college"));
		System.out.println(Review.sentimentVal("carl"));
		System.out.println(Review.totalSentiment("src/cLab/simpleReview.txt"));
		System.out.println(Review.starRating("src/cLab/simpleReview.txt"));
		System.out.println(Review.fakeReview("src/cLab/simpleReview.txt"));
		
		try {
			Scanner input = new Scanner(new File("src/cLab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine();
				System.out.println(temp);

			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}
	}
}
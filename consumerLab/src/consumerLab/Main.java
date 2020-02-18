package consumerLab;
import java.io.File;
import java.util.*;

class Main {
	public static void main(String[] args) {
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		System.out.println(Review.sentimentVal("happy"));
		System.out.println(Review.sentimentVal("carl"));
		System.out.println(Review.sentimentVal("college"));
		try {
			Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();
				System.out.println(temp);

			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}
		System.out.println(Review.totalSentiment("src/ConsumerLab/simpleReview.txt"));
	}
}
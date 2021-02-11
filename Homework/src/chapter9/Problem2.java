package chapter9;

public class Problem2 {

	public static void main(String[] args) {
		// Create a Random object with seed 1000
		java.util.Random randomNumber = new java.util.Random(1000);

		// Displays the first 5 random integers between 0 and 100
		for (int i = 1; i <= 5; i++) {
			if (i % 10 == 0)
				System.out.printf("%5d\n", randomNumber.nextInt(100));
			else
				System.out.printf("%5d", randomNumber.nextInt(100));
		}
		System.out.println();
		java.util.Random randomNumber2 = new java.util.Random(1000);

		// Displays the first 5 random integers between 0 and 100
		for (int i = 1; i <= 5; i++) {
			if (i % 10 == 0)
				System.out.printf("%5d\n", randomNumber2.nextInt(100));
			else
				System.out.printf("%5d", randomNumber2.nextInt(100));
	}
		System.out.println();
		java.util.Random randomNumber3 = new java.util.Random(1000);

		// Displays the first 5 random integers between 0 and 100
		for (int i = 1; i <= 5; i++) {
			if (i % 10 == 0)
				System.out.printf("%5d\n", randomNumber3.nextInt(100));
			else
				System.out.printf("%5d", randomNumber3.nextInt(100));
	}
}
	
}

package problem4_1;

import java.util.Scanner;

public class Problem4_1  {

	public static void main(String[] args) {

		OurStringHandlerClass stringHandler = new OurStringHandlerClass();

		stringHandler.loadString();

		Scanner input = new Scanner(System.in);
		BirthdayGuesser guesser = new BirthdayGuesser();
		guesser.getUserInputs(stringHandler, input);
		input.close();
	}
}

package problem4_1;

import java.util.Scanner;

public class BirthdayGuesser {
	OurStringHandlerClass stringHandler = new OurStringHandlerClass();

	public void getUserInputs(OurStringHandlerClass stringHandler, Scanner input) {
		int day = 0;


		day = this.setOnePrompt(stringHandler, day, input);

		day = this.setTwoPrompt(stringHandler, day, input);

		day = this.setThreePrompt(stringHandler, day, input);

		day = this.setFourPrompt(stringHandler, day, input);

		day = this.setFivePrompt(stringHandler, day, input);

		System.out.println("\nYour birthday is " + day + "!");

	}

	private int setFivePrompt(OurStringHandlerClass stringHandler2, int day, Scanner input) {
		String s;
		char answer;
		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set 5?\n");
		System.out.print(stringHandler.getSet5());
		System.out.print("\nEnter Y for Yes and N for No: ");
		s = input.nextLine();
		answer = s.charAt(0);

		if (Character.toUpperCase(answer) == 'Y')
			day += 16;
		return day;
	}

	private int setFourPrompt(OurStringHandlerClass stringHandler2, int day, Scanner input) {
		String s;
		char answer;
		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set 4?\n");
		System.out.print(stringHandler.getSet4());
		System.out.print("\nEnter Y for Yes and N for No: ");
		s = input.nextLine();
		answer = s.charAt(0);

		if (Character.toUpperCase(answer) == 'Y')
			day += 8;
		return day;
	}

	private int setThreePrompt(OurStringHandlerClass stringHandler2, int day, Scanner input) {
		String s;
		char answer;
		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set 3?\n");
		System.out.print(stringHandler.getSet3());
		System.out.print("\nEnter Y for Yes and N for No: ");
		s = input.nextLine();
		answer = s.charAt(0);

		if (Character.toUpperCase(answer) == 'Y')
			day += 4;
		return day;
	}

	private int setTwoPrompt(OurStringHandlerClass stringHandler2, int day, Scanner input) {
		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set 2?\n");
		System.out.print(stringHandler.getSet2());
		System.out.print("\nEnter Y for Yes and N for No: ");
		String s = input.nextLine();
		char answer = s.charAt(0);

		if (Character.toUpperCase(answer) == 'Y')
			day += 2;
		return day;
	}

	private int setOnePrompt(OurStringHandlerClass stringHandler, int day, Scanner input) {
		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set 1?\n");
		System.out.print(stringHandler.getSet1());
		System.out.print("\nEnter Y for Yes and N for No: ");
		String s = input.nextLine();
		char answer = s.charAt(0);

		if (Character.toUpperCase(answer) == 'Y')
			day += 1;
		return day;
	}

}

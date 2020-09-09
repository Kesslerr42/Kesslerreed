/*
(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
 */


package chapter3;

import java.util.Scanner;

public class Problem3_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//Generate random numbers

		int digit1 = (int)(Math.random() * 10 + 1);
		int digit2 = (int)(Math.random() * 10 + 1);
		int digit3 = (int)(Math.random() * 10 + 1);

		//Prompt user for input of the sum of all 3 numbers

		promptInput(input, digit1, digit2, digit3);

		input.close();
	}

	private static void promptInput(Scanner input, int digit1, int digit2, int digit3) {
		System.out.print("What is " + digit1 + " + " + digit2 + " + " + digit3 + "? ");
		int answer = input.nextInt();

		getOutput(digit1, digit2, digit3, answer);
	}

	private static void getOutput(int digit1, int digit2, int digit3, int answer) {
		//Here we display the output of their work
		System.out.println(
				digit1 + " + " + digit2 + " + " + digit3 + " = " + answer + " is " +
						(digit1 + digit2 + digit3 == answer));
	}

}

package chapter5;

import java.util.Scanner;

public class MathQuiz {
	private final int NUMBER_OF_QUESTIONS = 10;	// Number of questions
	private int correctCount = 0;	// Count the nubmer of correct answers
	private int count = 0;	// Count the number of questions
	private long startTime = System.currentTimeMillis();
	private String output = " "; // output string is initially empty
	private long endTime = System.currentTimeMillis();
	private long testTime = endTime - startTime;
	public void TakeQuiz(Scanner input) {
		startTime = System.currentTimeMillis();
		while (count < NUMBER_OF_QUESTIONS) {
			// 1. Generate two random single-digit integers
			int number1 = 1 + (int)(Math.random() * 15);
			int number2 = 1 + (int)(Math.random() * 15);

			// 2. Prompt the student to answer "What is number1 + number2?"
			System.out.print(
				"What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();

			// 3. Grade the answer and display the result
			if (number1 + number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;	// Increase the correct answer count
			}
			else
				System.out.println("Your answer is wrong.\n" + number1
					+ " + " + number2 + " should be " + (number1 + number2));
			
			// Increase the question count
			count++;

			output += "\n" + number1 + "+" + number2 + "=" + answer +
			((number1 + number2 == answer) ? " correct" : " wrong");
		}
		endTime = System.currentTimeMillis();
		testTime = endTime - startTime;
	}
	public void printResults() {
		System.out.println("Correct count is " + this.correctCount + 
				"\nTest time is " + this.testTime / 1000 + " seconds\n" + this.output);
		
	}
}

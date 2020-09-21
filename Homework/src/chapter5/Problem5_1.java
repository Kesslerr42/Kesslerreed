package chapter5;

import java.util.Scanner;

public class Problem5_1 {

	public static void main(String[] args) {
		MathQuiz quiz  = new MathQuiz();
		Scanner input = new Scanner(System.in);
		quiz.TakeQuiz(input);
		quiz.printResults();
		input.close();
	}
}

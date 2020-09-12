package chapter3;

import java.util.Scanner;

public class Problem3_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		// Generate a random integer 0, 1, or 2
		int computer = (int)(Math.random() * 3);

		// Prompt the user to enter a number 0, 1, or 2
		int user = promptUser(input);

		userInput(user);

		computerInput(computer);


		// Display result
		if (computer == user)
			System.out.println(" too. It is a draw");
		else
		{
			//Here is where it calculates all the ways for the user to win, if it meets one of these conditions, you win!
			//Otherwise, you lose horribly to the machine, you have lost to the man, RIP
			boolean win = (user == 0 && computer == 2) ||
					(user == 1 && computer == 0) || 
					(user == 2 && computer == 1);
			winDecider(win);
			input.close();
		}
	}
	private static int promptUser(Scanner input) {
		System.out.print("Scissor is (0), Rock is (1), Paper is (2): ");
		int user = input.nextInt();
		return user;
	}
	private static void winDecider(boolean win) {
		//Here we decide the winner
		if (win)
			System.out.println("...You won");
		else
			System.out.println("...You lose");
	}


	private static void userInput(int user) {
		//Here we prompt for user input
		System.out.print("You are ");
		switch (user)
		{
		case 0: System.out.print("scissor, "); break;
		case 1: System.out.print("rock, "); break;
		case 2: System.out.print("paper, ");
		}
	}

	private static void computerInput(int computer) {
		//Here we get the computers input
		System.out.print("the computer is ");
		switch (computer)
		{
		case 0: System.out.print("scissor"); break;
		case 1: System.out.print("rock"); break;
		case 2: System.out.print("paper");
		}


	}
}

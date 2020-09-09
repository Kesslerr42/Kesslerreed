package chapter3;

/*
Write a program that lets the user guess whether the flip of
a coin results in heads or tails. The program randomly generates an integer 0 or 1,
which represents head or tail. The program prompts the user to enter a guess and
reports whether the guess is correct or incorrect.
 */
import java.util.Scanner;
import java.util.Random;

public class Problem3_14 {

	public static void main(String[] args) {
		//Import Scanner
		Scanner in = new Scanner(System.in);

		Random random = new Random();
		//Coin flip!
		int coin_flip = random.nextInt(2);
		//And we call the other methods to make things neater
		int guess = guessingTime(in);

		answerTime(coin_flip, guess);



	}

	private static int guessingTime(Scanner in) {
		System.out.print("Coin flip.  Enter 1 for heads, 0 for tails: ");
		//Input your guess
		int guess = in.nextInt();
		return guess;
	}

	private static void answerTime(int coin_flip, int guess) {
		if(guess == coin_flip){
			System.out.println("Correct!");
		}else{
			System.out.println("Sorry, incorrect.");
		}
	}
}

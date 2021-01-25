package exam;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int ruleSelection = getRuleSelection();
		System.out.println("Rule:" + ruleSelection);

		int nextNumber = 0;

		switch(ruleSelection)
		{
		case 1: nextNumber = runArithmeticSequence(); break;
		case 2: nextNumber = runGeometricSequence(); break;
		case 3: nextNumber = runRecurrenceSequence(); break;
		case 4: nextNumber = runFibonacciSequence(); break;
		}

		System.out.println("Please enter the next term in the series.");
		Scanner input = new Scanner(System.in);
		int userAnswer = input.nextInt();
		if(userAnswer == nextNumber)
		{
			System.out.println("You are correct.");
		}
		else 
		{
			System.out.println("Better luck next time.");
			System.out.println("You should have tried: " + nextNumber);
		}

		input.close();
	}

	private static int getRuleSelection() {
		return (int)(Math.random()*4+1);
		
	}

	private static int runArithmeticSequence() {
		int startingNumber = (int)(Math.random()*100+1);		
		int difference = (int)(Math.random()*10+1);
		for(int index = 0; index<4; index++)
		{
			System.out.print("Item:" + (index+1) +", ");
			System.out.println("Term: " + (startingNumber + difference * index));
		}

		return (startingNumber + difference * 4);
	}

	private static int runGeometricSequence() {
		int startingNumber = (int)(Math.random()*100+1);		
		int ratio = (int)(Math.random()*5+1);
		for(int index = 0; index<4; index++)
		{
			System.out.print("Item:" + (index+1) +", ");
			System.out.println("Term: " + (int)(startingNumber + Math.pow(ratio,index)));
		}

		return (int) (startingNumber + Math.pow(ratio,4));
	}

	private static int runRecurrenceSequence() {
		int startingNumber = (int)(Math.random()*100+1);		
		int difference = (int)(Math.random()*10+1);
		for(int index = 0; index<4; index++)
		{
			System.out.print("Item:" + (index+1) +", ");
			System.out.println("Term: " + (startingNumber + difference * index));
		}

		return (startingNumber + difference * 4);
	}

	private static int runFibonacciSequence() {
		System.out.println("Fibonacci.");
		int startingNumber = (int)(Math.random()*10+1);		
		for(int index = 1; index<5; index++)
		{
			System.out.print("Item:" + (index) +", ");
			System.out.println("Term: " + fib(startingNumber + index));
		}

		return (int)fib(startingNumber + 5);
	}


	public static long fib(int n) {
		if ((n == 0) || (n == 1))
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}

}

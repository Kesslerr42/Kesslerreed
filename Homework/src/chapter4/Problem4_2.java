package chapter4;

import java.util.Scanner;

public class Problem4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer between 0 and 15
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimal = input.nextInt();
		

		printHexFromDecimal(decimal);
		
		for(int autoInput = 1; autoInput <16; autoInput++)
			printHexFromDecimal(autoInput);
		input.close();
	}

	private static void printHexFromDecimal(int decimal) {
		// Display its corresponding hex number
		if (decimal >= 0 && decimal <= 9)
			System.out.println("The hex value is " + decimal);
		else if (decimal >= 10 && decimal <= 15)
			System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
		else
			System.out.println(decimal + " is an invalid input");
	}
}

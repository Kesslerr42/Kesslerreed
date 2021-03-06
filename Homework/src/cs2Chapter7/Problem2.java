package cs2Chapter7;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner
		double[] numbers = new double[10]; // Create an array of length 10 

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();

		// Invoke bubblesort method
		bubbleSort(numbers);

		// display the sorted numbers
		for (double e: numbers) {
			System.out.print(e + " ");
			
		}
		System.out.println();
		input.close();
	}

	/** bubbleSort */
	public static void bubbleSort(double[] list) {
		double temp;
		boolean swapped;

		do {
			swapped = false; 
			for (int workingIndex = 0; workingIndex < list.length - 1; workingIndex++) {
				// If a neighboring pair is not in order, swap values
				if (list[workingIndex] > list[workingIndex + 1]) {
					temp = list[workingIndex];
					list[workingIndex] = list[workingIndex + 1];
					list[workingIndex + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped); // Repeat if a value was swapped
	}
}
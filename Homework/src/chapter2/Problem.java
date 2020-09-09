package chapter2;
import java.util.Scanner;
class Problem {

	public static void main(String[] args) {
		double celsius = getUserInput();
		double fahrenheit = convertCelsiusToFahrenheit(celsius);
		printResults(celsius, fahrenheit);


	}
	private static void printResults(double celsius, double fahrenheit) {
		//Here is the output
		System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
	}
	private static double getUserInput() {
		//Input a New Scanner
		Scanner input = new Scanner(System.in);
		//Prompt for the celsius degree
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		//Make sure to close the input
		input.close();
		//Here is where we can call our function later in the code 
		return celsius;
	}
	//Here in the static double is where we can do the conversion
	private static double convertCelsiusToFahrenheit(double celsius) {
		//double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
		//return fahrenheit;
		return (9.0 / 5.0) * celsius + 32.0;
	}
	

}

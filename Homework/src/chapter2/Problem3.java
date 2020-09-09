package chapter2;

import java.util.Scanner;
//*2.21 (Financial application: calculate future investment value) Write a program that reads in investment amount, annual interest rate, 
//and number of years, and displays the future investment value using the following formula: 
//futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12 
//For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98. 
//Here is a sample run: Enter investment amount: 1000.56 Enter annual interest rate in percentage: 4.25 
//Enter number of years: 1 Accumulated value is $1043.92
public class Problem3 {

	public static void main(String[] args) {
		//Input new Scanner
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter investment amount:");
		  double investmentAmount = input.nextDouble();
		  System.out.print("Enter annual interest rate in percentage:");
		  //Input your interest rate
		  double monthlyInterestRate = input.nextDouble();
		  monthlyInterestRate = monthlyInterestRate / 12;
		  System.out.print("Enter number of years:");
		  //Input the Years
		  double numberOfYears = input.nextDouble();
		  //Here is where we can do our math and get the proper outcome, 
		  //using a math.pow, and multiplyig a monthly interest rate by the number of years withe the invenstment amount  
		  double futureInvestmentValue = investmentAmount
		    * Math.pow((1 + monthlyInterestRate / 100),
		      (numberOfYears * 12));
		  System.out.printf("Accumulated value is $%.2f" , futureInvestmentValue);
		  input.close();
		 
		 }
		 
		}
package chapter5;



public class Bonus1 {

	public static void main(String[] args) {
		/* Revise listing 3.8
		 * Generate a lottery of a two digit number the two digits in the number are distinct
		 * Count how many times you have to guess to get the correct number, a single number, both numbers, both numbers in the right order
		 * If it costs $1 per play, and a single number correct is $1000, two numbers correct is $10,000, and both numbers correct in the right order is $100,000
		 * In a thousand lifetimes, what is your average on winning the lottery.
		 */
		
		MadScientist evil = new MadScientist();
		Accountant evan = new Accountant();
		GasStationClerk chad = new GasStationClerk();
		chad.generateRandomNumber();
		chad.reportNumber();
		chad.getLotteryTicket();
	}

}

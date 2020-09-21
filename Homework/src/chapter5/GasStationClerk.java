package chapter5;

import java.util.Random;

public class GasStationClerk {
	Random rnd = new Random(System.currentTimeMillis());
	private int number;
	private int number1;

	public GasStationClerk(){
		
	}
	public GasStationClerk(Random rnd) {
		// TODO Auto-generated constructor stub
	}

	

	public void reportNumber() {
	System.out.println("The number is: " + this.number);	
		
	}

	public void getLotteryTicket() {
		this.number1 = generateRandomNumber();
		
	}
	public int generateRandomNumber() {
		
		return this.number = rnd.nextInt(10);
		
	}

}

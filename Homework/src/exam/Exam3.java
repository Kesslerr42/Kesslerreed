package exam;

public class Exam3 {

	public static void main(String[] args) {
			int range = 100_000_000;
			int primes = 1;
			for (int check = 2; check < range; check++)
			{
				
				if(isPrime(check))
				{
				
					primes++;
									}
			}
			System.out.println("We have found " + primes + " primes."); 
		}

		private static boolean isPrime(int check) {
			boolean isPrime = true;
			for(int possibleFactor = 2; possibleFactor < check; possibleFactor++)
			{
				if(check % possibleFactor == 0)
				{
					isPrime = false;
					return isPrime;
				}
			}
			return isPrime;
		}
	}
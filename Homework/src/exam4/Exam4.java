package exam4;

public class Exam4 {

	public static void main(String[] args) {

		OperationsCounter recursiveStats = new OperationsCounter();
		OperationsCounter iterativeStats = new OperationsCounter();
		

		
		for(int fibNum = 10; fibNum <= 50; fibNum+=5)
		{
		// start of working on iterative:
			recursiveStats.resetIfCount();
			recursiveStats.resetAddCount();
			recursiveStats.startTimer();
		System.out.print("R" + fibNum+ "th fib: " 
				+ fib(fibNum,recursiveStats) 
				+ " ifs: " + recursiveStats.getIfCount()
				+ ", + or -: " + recursiveStats.getAddCount()
				+ ", =: " + recursiveStats.getAssignmentCount());
		recursiveStats.stopTimer();
		System.out.println(", millis: " + recursiveStats.getTime());
		
		
		}


		
		for(int fibNum = 10; fibNum <= 50; fibNum+=5)
		{
		// start of working on iterative:
		iterativeStats.resetIfCount();
		iterativeStats.resetAddCount();
		iterativeStats.startTimer();
		System.out.print("I" + fibNum+ "th fib: " 
				+ fibonacciLoop(fibNum,iterativeStats) 
				+ " ifs: " + iterativeStats.getIfCount()
				+ ", + or -: " + iterativeStats.getAddCount()
				+ ", =: " + iterativeStats.getAssignmentCount());
		iterativeStats.stopTimer();
		System.out.println(", millis: " + iterativeStats.getTime());
		}




	}

	public static int fibonacciLoop(long nthNumber, OperationsCounter iterativeStats) {
		//use loop
		
		int previouspreviousNumber, previousNumber = 0, currentNumber = 1;
		iterativeStats.increaseAssignmentOperations(3);
		iterativeStats.increaseIf();
		for (int i = 1; i < nthNumber ; i++) {
			iterativeStats.increaseAssignmentOperations(1);
			iterativeStats.increaseIf();

			previouspreviousNumber = previousNumber;

			previousNumber = currentNumber;

			currentNumber = previouspreviousNumber + previousNumber;
			iterativeStats.increaseArithmitic(1);
			iterativeStats.increaseAssignmentOperations(3);

		}
		return currentNumber;
	}

	private static long fib(long n, OperationsCounter recursiveStats) {
		if ((n == 0) || (n == 1))
		{
			recursiveStats.increaseIf();
			return n;
		}
		else
		{
			recursiveStats.increaseArithmitic(3);
			return fib(n - 1,recursiveStats) + fib(n - 2,recursiveStats);
		}
	}

}

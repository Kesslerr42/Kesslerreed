package exam4;

public class OperationsCounter {
	private int ifCount;
	private int arithmaticCount;
	private long startTime ;
	private long stopTime;
	private int assignmentCount;

	public void increaseIf() {
		this.ifCount++;
	}

	public int getIfCount() {
		return this.ifCount;
	}

	public void resetIfCount() {
		this.ifCount = 0;
	}

	public void increaseArithmitic(int numberOfOperations) {
		this.arithmaticCount += numberOfOperations;
	}

	public int getAddCount() {
		return this.arithmaticCount;
	}

	public long getTime() {
		return (this.stopTime - this.startTime);
	}

	public void startTimer() {
		this.startTime = System.currentTimeMillis();
	}

	public void stopTimer() {
		this.stopTime = System.currentTimeMillis();
	}

	public void resetAddCount() {
		this.arithmaticCount = 0;
	}

	public void increaseAssignmentOperations(int i) {
		this.assignmentCount += i;
		
	}

	public int getAssignmentCount() {
		return this.assignmentCount;
	}

}
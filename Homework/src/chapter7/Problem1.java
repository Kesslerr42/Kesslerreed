package chapter7;

public class Problem1 {

	public static void main(String[] args) {
		// randomly generates an array of 100,000
				// integers and a key
				int[] numbers = getNumbers();
				int key = getRandomInt();
				// Estimate the execution time of invoking the linearSearch
				int searchResult;
				long startTime;
				long endTime;
				long executionTime;
				searchResults(numbers, key);

				// Sort array
				selectionSort(numbers);

				// Estimate the execution time of invoking the linearSearch
				startTime = System.currentTimeMillis();
				searchResult = binarySearch(numbers, key);
				endTime = System.currentTimeMillis();
				executionTime = endTime - startTime;
				System.out.println(
					"Execution time of invoking the binarySearch in milliseconds: " 
					+ executionTime + " ");
			}

	private static int[] getNumbers() {
		int num;
		int[] numbers = new int[1000000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = getRandomInt();
		}
		return numbers;
	}

	private static void searchResults(int[] numbers, int key) {
		int searchResult;
		long startTime = System.currentTimeMillis();
		searchResult = linearSearch(numbers, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(
			"Execution time of invoking the linearSearch in milliseconds: " 
			+ executionTime);
	}

			/** getRandomInt */
			public static int getRandomInt() {
				return 1 + (int)(Math.random() * 100000);
			}

			/** linearSearch */
			public static int linearSearch(int[] array, int key) {
				for (int i = 0; i < array.length; i++) {
					if (key == array[i])
						return i;
				}
				return -1;
			}

			/** binarySearch */
			public static int binarySearch(int[] array, int key) {
				int low = 0;
				int high = array.length - 1;
				
				while (high >= low) {
					int mid = (low + high) / 2;
					if (key < mid)
						high = mid - 1;
					else if (key == mid)
						return mid;
					else
						low = mid + 1;
				}
				return -low -1;
			}

			/** selectionSort */
			public static void selectionSort(int[] array) {
				for (int i = 0; i < array.length; i++) {
					// Find the mimum in the array
					int min = array[i];
					int minIndex = i;

					for (int j = i + 1; j < array.length; j++) {
						if (min > array[j]) {
							min = array[j];
							minIndex = j;
						}
					}

					// Swap array[i] with array[minIndex] if necessary
					if (minIndex != i) {
						array[minIndex] = array[i];
						array[i] = min; 
					}
				}
			}
		}

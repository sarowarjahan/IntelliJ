package problem.solving;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int max = 100;
		int count = 0;
		// loop through the numbers one by one
		for (int i = 2; i<max; i++) {
			
			boolean isPrimeNumber = true;

			// check to see if the number is prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break; // exit the inner for loop
				}
			}
			
			// print the number if prime
			if (isPrimeNumber) {
				count = count + 1;
				System.out.print(i + " ");				
			}
		}
		System.out.print("\nTotal Prime Number " + count + " ");
	}

}

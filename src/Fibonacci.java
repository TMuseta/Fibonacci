/**
 * The Fibonacci demonstrating the recursive and iterative approach of solving
 * fibonacci function.
 */
public class Fibonacci {

	/**
	 * The recursive approach of generating Fibonacci series.
	 * 
	 * @param n the number up to which we want to calculate Fibonacci series.
	 * @return the last value in the series.
	 */
	static long fibRecursive(long n) {

		// Base case i.e. if n is 0 or 1, simply return that value.
		if (n < 2) {
			return n;
		} else {
			// Otherwise calling fibRecursive again to get previous two values.
			return fibRecursive(n - 1) + fibRecursive(n - 2);
		}
	}

	/**
	 * The iterative approach of generating Fibonacci series.
	 * 
	 * @param n the number up to which we want to calculate Fibonacci series.
	 * @return the last value in the series.
	 */
	static long fibIterative(long n) {
		long a = 0;
		long b = 1;
		long c = 0;
		for (int i = 0; i < n - 1; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	/**
     * Test driver of the program.
     * @param args
     */
    public static void main(String[] args) {

        int size[] = new int[] {5, 10, 15, 20, 30, 40, 50};

        long startTime, endTime;
        // Looping through different numbers up to which we want to generate the
        // fibonacci series.
        for (int n: size) {

            // Recording time just before calling fibRecursive
            startTime = System.nanoTime();
            long res = fibRecursive(n);
            // Recording time just after calling fibRecursive
            endTime = System.nanoTime();

            System.out.println("Recursive - Size: " + n + " Time Taken: " + (endTime-startTime) + " Value:" + res);

            // Recording time just before calling fibIterative
            startTime = System.nanoTime();
            res = fibIterative(n);
            // Recording time just after calling fibIterative
            endTime = System.nanoTime();

            System.out.println("Iterative - Size: " + n + " Time Taken: " + (endTime-startTime) + " Value:" + res);
        }
    }
}
package stopwatch;

/**
 * to add sum of double in an array.
 * 
 * @author Totsapon menkul
 *
 */
public class SumDoublePrimitive implements Runnable {
	// initialize a counter.
	private int counter;
	// initialize an array size.
	private int ARRAY_SIZE = 500000;
	// initialize an array values.
	double[] values = new double[ARRAY_SIZE];

	/**
	 * a constructor to get number of counter form TaskTimer.
	 * 
	 * @param counter
	 *            is number of input counter from TaskTimer.
	 */
	public SumDoublePrimitive(int counter) {
		this.counter = counter;
	}

	/**
	 * add number of 1 to ARRAY_SIZE and print out sum of amount of count input.
	 * 
	 */
	@Override
	public void run() {
		// create array of values to add before we start the timer
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;

		double sum = 0.0;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}
	}

	/**
	 * @return return a description of what is method run() do and show amount
	 *         of input(count).
	 */
	public String toString() {
		return String.format("Sum array of double primitives with count=%,d", counter);
	}

}

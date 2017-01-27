package stopwatch;

/**
 * to add sum of double in a Double class array.
 * 
 * @author totsapon menkul
 *
 */
public class SumDouble implements Runnable {
	// initialize a counter.
	private int counter;
	// initialize an array size
	private int ARRAY_SIZE = 50000;

	/**
	 * a constructor to get number of counter form TaskTimer.
	 * 
	 * @param counter
	 *            is number of input counter from TaskTimer.
	 */
	public SumDouble(int counter) {
		this.counter = counter;
	}

	/**
	 * add number of 1 to ARRAY_SIZE with Double class and print out sum of
	 * amount of count input.
	 * 
	 */
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);

		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}

	/**
	 * @return return a description of what is method run() do and show amount
	 *         of input(count).
	 */
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d", counter);
	}

}

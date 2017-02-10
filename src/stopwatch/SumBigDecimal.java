package stopwatch;

import java.math.BigDecimal;

/**
 * to add sum of Big decimal in an array.
 * 
 * @author Totsapon menkul
 *
 */
public class SumBigDecimal implements Runnable {
	// initialize a counter.
	private int counter;
	// initialize an array size.
	private int ARRAY_SIZE = 50000;
	// initialize an array values.
	BigDecimal[] values = new BigDecimal[ARRAY_SIZE];

	/**
	 * a constructor to get number of counter form TaskTimer.
	 * 
	 * @param counter
	 *            is number of input counter from TaskTimer.
	 */
	public SumBigDecimal(int counter) {
		this.counter = counter;
	}

	/**
	 * add number of 1 to ARRAY_SIZE with BigDecimal class and print out sum of
	 * amount of count input.
	 */
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);

		BigDecimal sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
	}

	/**
	 * @return return a description of what is method run() do and show amount
	 *         of input(count).
	 */
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d", counter);
	}

}

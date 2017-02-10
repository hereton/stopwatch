package stopwatch;

/**
 * append a char into a StringBuilder.
 * 
 * @author Totsapon menkul
 *
 */
public class AppendToStringBuilder implements Runnable {
	// initialize a counter.
	private int count;

	/**
	 * 
	 * @param number
	 *            is the amount of character to append.
	 */
	public AppendToStringBuilder(int count) {
		this.count = count;
	}

	/**
	 * add an 'a' char into a string by amount of input number. and print out
	 * length of the StringBuilder.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		String result = builder.toString();
	}

	/**
	 * @return return a description of what is method run() do and show amount
	 *         of input(count).
	 */
	public String toString() {
		return String.format("Append %,d chars to StringBuilder", count);
	}

}

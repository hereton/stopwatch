package stopwatch;

/**
 * append a char to string.
 * 
 * @author totsapon menkul
 *
 */
public class AppendToString implements Runnable {
	// initialize a counter.
	private int count = 50000;

	/**
	 * 
	 * @param number
	 *            is the amount of character to append.
	 */
	public AppendToString(int number) {
		this.count = number;
	}

	/**
	 * add an 'a' char into a string by amount of input number. and print out
	 * length of the string.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		String result = "";
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}

	/**
	 * @return return a description of what is method run() do and show amount
	 *         of input(count).
	 */
	public String toString() {
		return String.format("Append %,d chars to String", count);
	}

}

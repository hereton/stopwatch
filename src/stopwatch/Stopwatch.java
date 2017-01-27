package stopwatch;

// I am not sure to remove this or not 
import javax.print.attribute.standard.MediaSize.NA;

/**
 * 
 * make a stop watch class that measure elapsed time between a starting time and
 * stopping time or until present time.
 * 
 * @author totsapon menkul
 * 
 */
public class Stopwatch {
	// constant for converting nanosecond to second.
	private static final double NANOSECONDS = 1.0E-9;
	// time that the stopwatch was started, in nanoseconds.
	private long startTime = 0;
	// time that the stopwatch was stoped, in nanoseconds.
	private long stopTime = 0;
	// check is stopwatch is running?
	private boolean running = false;

	/**
	 * method to let stopwatch start in nanoseconds.
	 */
	public void start() {
		if (this.running) {
			System.out.println("you already start the stopwatch");
		} else {
			this.startTime = System.nanoTime();
			running = true;
		}

	}

	/**
	 * method to let stopwatch stop time in nanoseconds.
	 */
	public void stop() {
		if (this.running) {
			this.stopTime = System.nanoTime();
			running = false;
		} else {
			System.out.println("you already stop the stopwatch");
		}
	}

	/**
	 * method to check if the stopwacth is running.
	 * 
	 * @return boolean running.
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * method to return time in second.
	 * 
	 * @return return the time with converted in second.
	 */
	public double getElapsed() {
		if (running) {
			return (System.nanoTime() - this.startTime) * NANOSECONDS;
		} else {
			return (this.stopTime - this.startTime) * NANOSECONDS;
		}
	}
}

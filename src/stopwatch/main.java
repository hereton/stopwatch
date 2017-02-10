package stopwatch;

/**
 * main class that launch TaskTimer with runnable.
 * 
 * @author Totsapon menkul
 *
 */
public class Main {
	public static void main(String[] args) {
		TaskTimer timer = new TaskTimer();

		// another way to run task.
		Runnable[] tasks = new Runnable[] {

				new AppendToString(50_000), new AppendToString(100_000), new AppendToStringBuilder(100_000),
				new SumDoublePrimitive(1_000_000_000), new SumDouble(1_000_000_000), new SumBigDecimal(1_000_000_000)

		};

		for (int k = 0; k < tasks.length; k++)
			timer.measureAndPrint(tasks[k]);
	}
}

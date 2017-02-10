package stopwatch;

/**
 * TaskTimer is a kind of stopwatch that count amount of time of each task that
 * is running.
 * 
 * @author Totsapon menkul
 *
 */
public class TaskTimer {
	public void measureAndPrint(Runnable task) {
		// describe the task
		System.out.println(task.toString());
		Stopwatch timer = new Stopwatch();
		timer.start();

		// run the task
		task.run();

		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

	// public static void main(String[] args) {
	//
	// TaskTimer timer = new TaskTimer();
	//
	// Runnable t1 = new AppendToString(50_000);
	// Runnable t2 = new AppendToStringBuilder(1_000_000);
	// Runnable t3 = new SumDoublePrimitive(50_000);
	// Runnable t4 = new SumDouble(50000);
	// Runnable t5 = new SumBigDecimal(50000);
	//
	// timer.measureAndPrint(t1);
	// timer.measureAndPrint(t2);
	// timer.measureAndPrint(t3);
	// timer.measureAndPrint(t4);
	// timer.measureAndPrint(t5);
	//
	//
	// }

}

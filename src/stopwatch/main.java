package stopwatch;

/**
 * main class that launch TaskTimer with runnable.
 * 
 * @author totsapon menkul
 *
 */
public class Main {
	public static void main(String[] args) {
		TaskTimer timer = new TaskTimer();

		// Runnable t1 = new AppendToString(50_000);
		// Runnable t2 = new AppendToStringBuilder(1_000_000);
		// Runnable t3 = new SumDoublePrimitive(50_000);
		// Runnable t4 = new SumDouble(50000);
		// Runnable t5 = new SumBigDecimal(50000);

		// timer.measureAndPrint(t1);
		// for(int count=1000; count<=10000; count=count*10)
		// timer.measureAndPrint( new AppendToString(count) );
		// timer.measureAndPrint(t2);
		// timer.measureAndPrint(t3);
		// timer.measureAndPrint(t4);
		// timer.measureAndPrint(t5);
		
		
		// another way to run task.
		Runnable[] tasks = new Runnable[] { 
				
				new AppendToString(50_000), 
				new AppendToString(100_000),
				new AppendToStringBuilder(100_000), 
				new SumDoublePrimitive(1_000_000_000), 
				new SumDouble(1_000_000_000),
				new SumBigDecimal(1_000_000_000) 
				
		};

		for (int k = 0; k < tasks.length; k++)
			timer.measureAndPrint(tasks[k]);
	}
}

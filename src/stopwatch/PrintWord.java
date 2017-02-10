package stopwatch;
/**
 * this class is my test class with The best teacher in SKE. Teacher JIM fatalaijon.
 * @author Totsapon menkul
 *
 */
public class PrintWord implements Runnable {

	/**
	 * print a word
	 */
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i'm running !!");
		}
		
	}

	/**
	 * return an explanation about what is this class do.
	 * @return return an explanation about what is this class do.
	 */
	public String toString(){
	 return "this class print a message";
	}
	
}

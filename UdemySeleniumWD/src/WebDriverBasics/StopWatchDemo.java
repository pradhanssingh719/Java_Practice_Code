package WebDriverBasics;

import org.apache.commons.lang3.time.StopWatch;

public class StopWatchDemo {

	public static void main(String[] args) {
			StopWatch watch = new StopWatch();
			watch.start();
			System.out.println(watch.getTime());
			watch.stop();
			System.out.println(watch.getTime());
	}

}

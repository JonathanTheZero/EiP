import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MultiThreading {
	public static void main(String... strings) throws InterruptedException {
		List<CounterThread> list = new ArrayList<>();
		for (int i = 1; i <= 5; ++i) {
			int time = ThreadLocalRandom.current().nextInt(1, 4);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list.add(new CounterThread(i));
		}

		for (CounterThread c : list) {
			c.start();
		}
		
		for (CounterThread c : list) {
			c.join();
		}
	}
}

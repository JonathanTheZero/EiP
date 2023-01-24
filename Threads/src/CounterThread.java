import java.util.concurrent.ThreadLocalRandom;

public class CounterThread extends Thread {

	private int ID;
	private static int counter;

	public CounterThread(int num) {
		this.ID = num;
	}

	@Override
	public void run() {
		while (getCounter() <= 42) {
			int time = ThreadLocalRandom.current().nextInt(1, 4);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			boolean result = increase(ID);
			if (!result) {
				return;
			}
		}
	}

	private static synchronized boolean increase(int ID) {
		if (getCounter() >= 42) {
			return false;
		}
		counter++;
		System.out.println("Thread " + ID + ": " + counter);
		return true;
	}

	public int getID() {
		return ID;
	}

	public static synchronized int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CounterThread.counter = counter;
	}
}

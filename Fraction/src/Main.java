import java.util.concurrent.ThreadLocalRandom;

public class Main {
	public static void main(String[] args) {
		Fraction f = new Fraction(2, 3);
		Fraction f2 = new Fraction(1, 3);
		System.out.println(f.toString());
		f.multiply(f2);
		System.out.println(f.toString());
		f.add(f2);
		System.out.println(f.asDouble());
		System.out.println(f.toString());
		
		int i = 0;
		while(true) {
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(1, 40) * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(++i);
		}
	}
}

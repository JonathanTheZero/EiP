
public class Main {
	public static void main(String[] args) {
		Fraction f = new Fraction(2, 3);
		Fraction f2 = new Fraction(1,3);
		System.out.println(f.toString());
		f.multiply(f2);
		System.out.println(f.asDouble());
	}
}


public class Multiply implements GenericFunction<Integer, Integer> {

	private int factor;

	public Multiply(int factor) {
		this.factor = factor;
	}

	@Override
	public Integer calculate(Integer x) {
		return factor * x;
	}

	public static void main(String... strings) {
		Multiply timesThree = new Multiply(3);
		Multiply timesFour = new Multiply(4);
		System.out.println(timesThree.calculate(timesFour.calculate(5)));
		
		GenericFunction<Integer, Integer> t3 = x -> x * 3,
				t4 = x -> x * 4;
		System.out.println(t3.calculate(t4.calculate(5)));
	}

}

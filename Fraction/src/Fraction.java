
public class Fraction {

	private int nominator;
	private int denominator;

	public Fraction(int nominator, int denominator) {
		if (denominator == 0) {
			denominator = 1;
		}
		this.nominator = nominator;
		this.denominator = denominator;
	}

	public Fraction(int n) {
		nominator = n;
		denominator = 1;
	}
	
	public void multiply(Fraction factor) {
		nominator *= factor.getNominator();
		denominator *= factor.getDenominator();
	}

	public int getNominator() {
		return nominator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void add(Fraction summand) {
		if(summand.getDenominator() == denominator) {
			nominator += summand.getNominator();
		} else {
			nominator = nominator * summand.getDenominator() + summand.getNominator() * denominator;
			denominator *= summand.getDenominator();
		}
	}
	
	@Override
	public String toString() {
		return nominator + "/" + denominator;
	}
	
	public double asDouble() {
		return (double)nominator/(double)denominator;
	}
}

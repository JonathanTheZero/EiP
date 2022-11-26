
public class Fraction {

	private int nominator;
	private int denominator;

	Fraction(int nominator, int denominator) {
		if (nominator == 0) {
			nominator = 1;
		}
		this.nominator = nominator;
		this.denominator = denominator;
	}

	Fraction(int n) {
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
			nominator = nominator * summand.getDenominator() + summand.getNominator();
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

import java.util.List;
import java.util.stream.Collectors;
//Add to classpath
import org.apache.commons.math3.primes.Primes;

public class PrimeTesterApplication {
	public static List<Integer> getCommonPrimeFactors(int a, int b) {

		List<Integer> primeFactorsA = Primes.primeFactors(a), primeFactorsB = Primes.primeFactors(b);

		primeFactorsA.retainAll(primeFactorsB);

		return primeFactorsA.stream().distinct().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> test = PrimeTesterApplication.getCommonPrimeFactors(15, 25);
		for (Integer i : test) {
			System.out.println(i);
		}
		System.out.println("---------------");
		test = PrimeTesterApplication.getCommonPrimeFactors(454542, 1482932);
		for (Integer i : test) {
			System.out.println(i);
		}
		System.out.println("---------------");
	}
}

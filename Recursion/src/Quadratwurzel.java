
public class Quadratwurzel {

	public static void main(String[] args) {
		System.out.println(quadratwurzel(25, 2));
		System.out.println(quadratwurzel(25, 3));
		System.out.println(quadratwurzel(25, 4));
		System.out.println(quadratwurzel(25, 15));

	}
	
	public static double quadratwurzel(double x, int n) {
		if(n == 0) return (x+1)/2;
		
		double root = quadratwurzel(x, n - 1);
		
		return 0.5 * (root + x/root);
	}

}

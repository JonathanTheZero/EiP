
public class CrossSum {

	public static void main(String[] args) {
		System.out.println(calculateCrossSum(125));
	}

	public static int calculateCrossSum(int n) {
		int result = 0;
		String nStr = Integer.toString(n);
		
		for(int i = 0; i < nStr.length(); ++i) {
			result += Integer.parseInt(nStr.substring(i, i + 1));
		}
		
		return result;
	}
}

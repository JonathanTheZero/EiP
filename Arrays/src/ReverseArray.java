
public class ReverseArray {
	public static int[] reverse(int[] a) {
		if (a == null) {
			return null;
		}
		
		int[] reversed = new int[a.length];
		for (int i = 0; i < a.length; ++i) {
			reversed[i] = a[a.length - i - 1];
		}

		return reversed;
	}
}

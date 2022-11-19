
public class IsSortedArray {
	public static boolean isSorted(int[] a) {
		if (a == null || a.length == 0) {
			return true;
		}
		
		int temp = a[0];
		for (int i = 1; i < a.length; ++i) {
			if (a[i] < temp) {
				return false;
			}
			temp = a[i];
		}

		return true;
	}
}

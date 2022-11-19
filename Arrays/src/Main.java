
public class Main {
	public static void main(String[] args) {
		int[] x = {1, 2, 3, 4, 5, 6},
			x2 = {1, 2, 5, 67, 23, 6};
		printArr(x);
		printArr(ReverseArray.reverse(x));
		System.out.println(IsSortedArray.isSorted(x));
		System.out.println(IsSortedArray.isSorted(x2));
	}
	
	private static void printArr(int[] a) {
		System.out.print("[");
		for(int i : a) {
			System.out.print(i + ", ");
		}
		System.out.print("]\n");
	}
}

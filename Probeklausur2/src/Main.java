import java.util.Stack;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		System.out.println(areAllCharsLowerCase("abcdefG".toCharArray()));
	}

	public static boolean areAllCharsLowerCase(char[] a) {
		return areAllCharsLowerCase(a, 0);
	}

	private static boolean areAllCharsLowerCase(char[] a, int position) {
		if (position < a.length) {
			if (!Character.isLowerCase(a[position])) {
				return false;
			}
			return areAllCharsLowerCase(a, position + 1);
		}
		return true;
	}

}

import java.util.Scanner;

public class ZaehleTEL {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zeichenfolge ein: ");
		String eingabe = scanner.nextLine();
		char[] zeichen = eingabe.toCharArray();
		countTEL(zeichen);
		scanner.close();
	}

	private static void countTEL(char[] zeichen) {
		int t = 0, e = 0, l = 0;
		for (char c : zeichen) {
			if (c == 't' || c == 'T')
				t++;
			else if (c == 'E' || c == 'e')
				e++;
			else if (c == 'L' || c == 'l')
				l++;
		}
		System.out.println("Der Buchstabe ’t’ kommt " + t + " mal vor.");
		System.out.println("Der Buchstabe ’e’ kommt " + e + " mal vor.");
		System.out.println("Der Buchstabe ’l’ kommt " + l + " mal vor.");
	}
}

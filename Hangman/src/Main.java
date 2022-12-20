import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int ranInd = 2;//random.nextInt(words.length);
		
		String word = words[ranInd];
		
		Hangman hangman = new Hangman(word);
		Scanner scanner = new Scanner(System.in);
		
		while(!hangman.isWon() && !hangman.isGameOver()) {
			System.out.println("Aktuelles Wort:" + hangman.toString());
			System.out.println("So viele Versuche hast du noch: " + hangman.wrongTriesLeft());
			System.out.println("Bitte Buchstaben eingeben:");
			String guess = scanner.nextLine();
			if(guess.length() != 1) {
				System.out.println("Bitte nur einen Buchstaben eingeben.");
				continue;
			}
			char guessChar = guess.charAt(0);
			boolean isSuccessful = hangman.makeGuess(guessChar);
			
			if(isSuccessful) {
				System.out.println("Richtig!");
			} else {
				System.out.println("Falsch!");
			}
		}
		
		if(hangman.isGameOver()) {
			System.out.println("Leider verloren! Die Lösung war: " + hangman.solution());
		}
		if(hangman.isWon()) {
			System.out.println("Richtig! Das Wort ist: " + hangman.solution());
		}
		
		scanner.close();

	}
	
	private static String[] words = {
		"Baum", "Wortvorschalg", "Hangman", "Test", "Kuchen"	
	};

}

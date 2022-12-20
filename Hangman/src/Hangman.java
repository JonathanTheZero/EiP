
public class Hangman {
	private String word;
	private final int MAX_WRONG_GUESSES = 10;
	private int wrongGuesses = 0;
	private String usedCharacters = "";
	private String currentWord = "";

	public Hangman(String word) {
		this.word = word.toUpperCase();
		for (int i = 0; i < word.length(); ++i) {
			currentWord += "_";
		}
	}

	public boolean makeGuess(char ch) {
		ch = Character.toUpperCase(ch);
		if (usedCharacters.indexOf(ch) != -1) {
			return true;
		}
		int index = word.indexOf(ch);
		boolean isIncluded = index != -1;

		char[] wordChar = currentWord.toCharArray();
		if (isIncluded) {
			for (int i = 0; i < word.length(); ++i) {
				if (word.charAt(i) == ch) {
					wordChar[i] = ch;
				}
			}
			currentWord = new String(wordChar);
		} else {
			wrongGuesses++;
		}

		usedCharacters += ch;

		return isIncluded;
	}

	public int wrongTriesLeft() {
		return MAX_WRONG_GUESSES - wrongGuesses;
	}

	public String solution() {
		return word;
	}

	public boolean isWon() {
		return currentWord.equalsIgnoreCase(word);
	}
	
	public boolean isGameOver() {
		return MAX_WRONG_GUESSES == wrongGuesses;
	}

	@Override
	public String toString() {
		return currentWord;
	}
}

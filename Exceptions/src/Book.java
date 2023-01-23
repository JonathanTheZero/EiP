
public class Book {
	private String title;
	private String ISBN;

	public Book(String title, String ISBN) throws Exception {
		if (title == null) {
			throw new IllegalArgumentException("Der Titel darf nicht null sein.");
		}
		if (ISBN == null) {
			throw new IllegalArgumentException("Die ISBN darf nicht null sein");
		}
		parseISBN(ISBN);
		this.title = title;
		this.ISBN = ISBN;
	}

	private void parseISBN(String ISBN) throws IllegalISBNException {
		if (ISBN.length() == 10) {
			// \d{9}[\dXx]
			for (int i = 0; i < ISBN.length(); ++i) {
				char c = ISBN.charAt(i);
				if (!Character.isDigit(c) && i != 9 || i == 9 && !(c == 'X' || c == 'x' || Character.isDigit(c))) {
					throw new IllegalISBN10Exception("10er ISBN enthält ein ungültiges Zeichen: " + ISBN);
				}
			}
		} else if (ISBN.length() == 13) {
			if (!ISBN.startsWith("978")) {
				throw new IllegalISBN13Exception("ISBN startet nicht mit 978: " + ISBN);
			}
			for (int i = 3; i < ISBN.length(); ++i) {
				if (!Character.isDigit(ISBN.charAt(i))) {
					throw new IllegalISBN13Exception("13er ISBN darf nur aus Ziffern bestehen: " + ISBN);
				}
			}
		} else {
			throw new IllegalISBNException("Länge stimmt nicht für eine gültige ISBN: " + ISBN);
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

}

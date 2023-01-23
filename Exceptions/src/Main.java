
public class Main {

	public static void main(String[] args) {
		String[] ISBNs = new String[] { "0123456789", "123456789x", "123456789X", "123456789y", "x234567890",
				"9781234567890", "978123456789X", "123456789" };

		for (String ISBN : ISBNs) {
			try {
				Book b = new Book("Titel", ISBN);
			} catch (Exception e) {
				System.err.println("Fehler beim Erstellen: " + e.getMessage());
			}
		}

	}

}

public class Tierpark {
	public static void main(String[] args) {
		Owner huber = new Owner("Bauer Huber");
		Owner schmidt = new Owner("Bauer Schmidt");
		
		Schaf shina = new Schaf("Shina", huber);
		shina.introduce();
		shina.setOwner(schmidt);
		shina.introduce();
		
		Wolf alpha = new Wolf("Alpha");
		alpha.introduce();
		Maus susi = new Maus("Susi");
		susi.introduce();
		
		Katze mia = new Katze("Mia", schmidt);
		mia.introduce();
	}
}


public class Main {

	public static void main(String[] args) {
		Quadrat q = new Quadrat(5, "Rot", "Gelb");
		System.out.println(q.getFlächeninhalt());
		System.out.println(q.getFüllfarbe());
		Kreis k = new Kreis(7, "Schwarz", "Rot");
		System.out.println(k.getKreisumfang());
	}

}

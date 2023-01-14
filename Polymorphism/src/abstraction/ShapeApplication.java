package abstraction;

import java.util.Scanner;

public class ShapeApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shape[] shapes = new Shape[10];

		System.out.println(
				"Bitte geben Sie eine geometrische Form ein. Zur Auswahl stehen:\nDreieck\nQuadrat\nLinie\n\nZum Beenden des Programmes geben Sie \"Ende\" ein.");
		for (int i = 0; i < shapes.length; i++) {
			String text = scanner.nextLine();
			if (text.equals("Ende"))
				break;

			if (text.equals("Quadrat")) {
				shapes[i] = new Square();
			} else if (text.equals("Dreieck")) {
				shapes[i] = new Triangle();
			} else if (text.equals("Linie")) {
				shapes[i] = new Line();
			}
		}

		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] != null) {
				shapes[i].printShape();
				System.out.println();
			}
		}
		scanner.close();
	}
}

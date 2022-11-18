import java.util.Scanner;

public class TriangleOutput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Hoehe des Dreiecks ein: ");
		int triangleSize = scanner.nextInt();
		drawTriangle(triangleSize);
		scanner.close();
	}

	static void drawTriangle(int sizeOfTriangle) {
		for (int i = 0; i < sizeOfTriangle; ++i) {
			//Bitte NIEMALS so in der Realität umsetzen, ich hab nur Langeweile
			for (int j = 0; j <= i; System.out.print("*"), j++);
			System.out.println();
		}
	}
}
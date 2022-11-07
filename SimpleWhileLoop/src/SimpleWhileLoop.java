
public class SimpleWhileLoop {

	public static void main(String[] args) {
		int i = 0;
		while(i++ < 10) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("Boom!");
	}
}

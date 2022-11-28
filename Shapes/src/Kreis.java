
public class Kreis extends Shape {
	private double radius;
	
	public Kreis(double radius, String ffarbe, String lfarbe) {
		super(ffarbe, lfarbe);
		this.radius = radius;
	}
	
	public double getKreisumfang() {
		return 2 * radius * Math.PI;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}

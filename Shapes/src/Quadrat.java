
public class Quadrat extends Shape {
	
	double seitenlänge;

	public Quadrat(double seitenlänge, String ffarbe, String lfarbe) {
		super(ffarbe, lfarbe);
		this.seitenlänge = seitenlänge;
	}
	
	public double getFlächeninhalt() {
		return seitenlänge * seitenlänge;
	}
	
	public double getSeitenlänge() {
		return seitenlänge;
	}

	public void setSeitenlänge(double seitenlänge) {
		this.seitenlänge = seitenlänge;
	}
}

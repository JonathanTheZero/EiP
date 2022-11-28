
public abstract class Shape {
	private String füllfarbe;
	private String linienfarbe;
	
	public Shape(String ffarbe, String lfarbe) {
		füllfarbe = ffarbe;
		linienfarbe = lfarbe;
	}
	
	public String getFüllfarbe() {
		return füllfarbe;
	}

	public void setFüllfarbe(String füllfarbe) {
		this.füllfarbe = füllfarbe;
	}
	
	public String getLinienfarbe() {
		return linienfarbe;
	}

	public void setLinienfarbe(String linienfarbe) {
		this.linienfarbe = linienfarbe;
	}
}


public class Question {
	private String text;
	private int points;

	public Question(String text, int points) {
		this.text = text;
		this.points = points;
	}

	public String getText() {
		return text;
	}

	public int getPoints() {
		return points;
	}
}

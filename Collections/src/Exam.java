import java.util.ArrayList;
import java.util.List;

public class Exam {
	private String name;
	private int year;
	private List<Question> questions;

	public Exam(String name, int year) {
		this.name = name;
		this.year = year;
		this.questions = new ArrayList<Question>();
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public int getNumberOfQuestions() {
		return questions.size();
	}

	public int getSumOfPoints() {
		return questions.stream().mapToInt(Question::getPoints).sum();
	}

	public void AddQuestion(String text, int points) {
		questions.add(new Question(text, points));
	}

	public void orderQuestionsByLength() {
		questions.sort((q1, q2) -> q2.getText().length() - q1.getText().length());
	}

	public void orderQuestionsByPoints() {
		questions.sort((q1, q2) -> q2.getPoints() - q1.getPoints());
	}

	public void printQuestions() {
		System.out.println("Prüfung " + name + " (" + year + ", " + getSumOfPoints() + " Punkte):");
		for (Question q : questions) {
			System.out.println(q.getText() + " | " + q.getPoints());
		}
		System.out.println("---------------------");
	}
}

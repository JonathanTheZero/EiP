import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

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

	public void save() {
		try (PrintWriter writer = new PrintWriter("config.txt")) {
			writer.println(this.name);
			writer.println(this.year);
			writer.println(this.questions.size());
			for (Question q : questions) {
				writer.println(q.getText());
				writer.println(q.getPoints());
			}
		} catch (Exception e) {
			System.err.println("Fehler beim Schreiben der Datei: " + e.getMessage());
		}
	}

	public boolean load() {
		questions.clear();
		try (BufferedReader reader = new BufferedReader(new FileReader("config.txt"))) {
			int lineIndex = 0;
			String content;
			while ((content = reader.readLine()) != null) {
				if (lineIndex == 0) {
					name = content;
				} else if (lineIndex == 1) {
					year = Integer.parseInt(content);
				} else if (lineIndex == 2) {
					// ignore: Question count
				} else {
					questions.add(new Question(content, Integer.parseInt(reader.readLine())));
				}
				lineIndex++;
			}
		} catch (FileNotFoundException e) {
			System.err.println("Datei nicht gefunden.");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			System.err.println("Fehler beim Lesen der Datei!");
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			System.err.println("Ein anderer Fehler ist aufgetreten!");
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// region Questions
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
	// endregion
}

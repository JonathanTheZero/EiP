
public class ExamApplication {
	public static void main(String... args) {
		Exam exam = new Exam("EiP Prüfung", 2023);
		exam.printQuestions();
		//exam.AddQuestion("Wie heißt Prof. Dr. Stickroth mit Vornamen?", 95);
		//exam.AddQuestion("Was ist objektiv gesehen die schlechteste Programmiersprache und warum ist es Java?", 5);
		exam.load();
		exam.printQuestions();
	}
}

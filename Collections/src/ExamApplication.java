
public class ExamApplication {
	public static void main(String... args) {
		Exam exam = new Exam("EiP Prüfung", 2022);
		exam.AddQuestion("Wie heißt Prof. Dr. Stickroth mit Vornamen?", 95);
		exam.AddQuestion("Was ist objektiv gesehen die schlechteste Programmiersprache und warum ist es Java?", 5);
		exam.printQuestions();
		exam.orderQuestionsByLength();
		exam.printQuestions();
		exam.orderQuestionsByPoints();
		exam.printQuestions();
	}
}

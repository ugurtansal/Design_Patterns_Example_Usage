package Online_Lesson_App;

public class LessonMain{
    public static void main(String[] args) {
        CourseMediator mediator = new CourseMediator();

        User ali = new User("Ali");
        User ayse = new User("Ayşe");

        mediator.registerUser(ali);
        mediator.registerUser(ayse);

        // Teacher publishes a lesson
        mediator.publishLesson("Java 101", "Java temelleri");

        // Users start the lesson
        mediator.startLesson(ali, "Java 101");
        mediator.startLesson(ayse, "Java 101");

        // Same lesson (flyweight)
        mediator.publishLesson("Java 101", "Java temelleri"); // Contains the same content, should not create a new lesson
    }
}

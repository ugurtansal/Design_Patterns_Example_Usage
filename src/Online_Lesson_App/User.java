package Online_Lesson_App;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void notifyNewLesson(Lesson lesson) {
        System.out.println("Hello " + name + ", New lesson: " + lesson.getTitle());
    }

    public void startLesson(Lesson lesson) {
        System.out.println(name + " is watching: " + lesson.getTitle());
        lesson.showContent();
    }
}

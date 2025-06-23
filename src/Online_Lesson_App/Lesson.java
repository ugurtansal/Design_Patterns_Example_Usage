package Online_Lesson_App;

public class Lesson {
    private final String title;
    private final String content;

    public Lesson(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void showContent() {
        System.out.println("Lesson " + title + ": " + content);
    }

    public String getTitle() {
        return title;
    }
}

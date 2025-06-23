package Online_Lesson_App;

import java.util.ArrayList;
import java.util.List;

public class CourseMediator {
    private List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
    }

    public void publishLesson(String title, String content) {
        Lesson lesson = LessonFactory.getLesson(title, content);
        System.out.println("\n New lesson is published: " + title);

        for (User user : users) {
            user.notifyNewLesson(lesson);
        }
    }

    public void startLesson(User user, String title) {
        Lesson lesson = LessonFactory.getLesson(title, "Default content");
        user.startLesson(lesson);
    }
}


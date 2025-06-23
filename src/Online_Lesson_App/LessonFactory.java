package Online_Lesson_App;

import java.util.HashMap;
import java.util.Map;

public class LessonFactory {
    private static final Map<String, Lesson> lessonMap = new HashMap<>();

    public static Lesson getLesson(String title, String content) {
        String key = title; // Unique key based on title and content
        if(title == null || content == null) {
            throw new IllegalArgumentException("Title and content cannot be null");
        } else if (!lessonMap.containsKey(key)) {
            lessonMap.put(key, new Lesson(title, content));
        }
        return lessonMap.get(title);
    }
}

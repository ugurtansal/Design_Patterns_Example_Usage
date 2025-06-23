package Social_Media_App;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Observer> followers = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addFollower(Observer o) {
        followers.add(o);
    }

    public void postContent(String content) {
        System.out.println(name + " shared a new content: " + content);
        notifyFollowers(content);
    }

    private void notifyFollowers(String content) {
        for (Observer f : followers) {
            f.update(content);
        }
    }
}

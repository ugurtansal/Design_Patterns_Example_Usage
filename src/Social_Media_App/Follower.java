package Social_Media_App;

public class Follower implements Observer {
    private String name;

    public Follower(String name) {
        this.name = name;
    }

    public void update(String content) {
        System.out.println( name + ", new content: " + content);
    }
}

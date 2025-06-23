package Social_Media_App;

public class MainApp {
    public static void main(String[] args) {
        // Observer
        User user = new User("Elif");
        Follower f1 = new Follower("Ahmet");
        Follower f2 = new Follower("Zeynep");
        user.addFollower(f1);
        user.addFollower(f2);

        // Sharing content
        user.postContent("Vacation photos!");

        // Flyweight:Same image reused
        Image img1 = ImageFactory.getImage("beach.png");
        Image img2 = ImageFactory.getImage("beach.png"); // aynı nesne döner
        img1.display("Profile Picture");
        img2.display("Shared Post");

        // Mediator: Content center for interactions
        InteractionMediator mediator = new InteractionCenter();
        mediator.like("Ahmet", "Post123");
        mediator.comment("Zeynep", "Post123", "Wonderful!");
        mediator.share("Ahmet", "Post123");
    }
}

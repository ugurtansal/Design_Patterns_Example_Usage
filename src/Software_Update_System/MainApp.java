package Software_Update_System;

public class MainApp {
    public static void main(String[] args) {
        // Modular (Chain of Responsibility + Visitor)
        Module auth = new StandardModule("User Authentication");
        Module chat = new StandardModule("Messaging System");
        Module backup = new PremiumModule("Automatic Backup");
        Module darkMode = new PremiumModule("Dark Mode");

        // Chain
        auth.setNext(chat);
        chat.setNext(backup);
        backup.setNext(darkMode);

        // User and Mediator (ıt will be communicator Observer )
        User user1 = new User("Ali");
        UpdateMediator mediator = new UpdateMediator(false); // Not Premium User
        mediator.addObserver(user1);

        // Start the update process
        mediator.performUpdate(auth);
    }
}

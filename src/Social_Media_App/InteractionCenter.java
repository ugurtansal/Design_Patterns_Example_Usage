package Social_Media_App;

public class InteractionCenter implements InteractionMediator {
    public void like(String user, String contentId) {
        System.out.println("❤️ " + user + ", " + contentId + "is liked .");
    }

    public void comment(String user, String contentId, String comment) {
        System.out.println("💬 " + user + " commented: \"" + comment + "\" → Content: " + contentId);
    }

    public void share(String user, String contentId) {
        System.out.println("🔁 " + user + ", " + contentId + " shared your post.");
    }
}

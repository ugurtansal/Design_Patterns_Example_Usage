package Social_Media_App;

public interface InteractionMediator {
    void like(String user, String contentId);
    void comment(String user, String contentId, String comment);
    void share(String user, String contentId);
}

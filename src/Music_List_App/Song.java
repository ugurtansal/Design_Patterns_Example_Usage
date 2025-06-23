package Music_List_App;

public interface Song {
    void accept(SongVisitor visitor);
    String getTitle();
}

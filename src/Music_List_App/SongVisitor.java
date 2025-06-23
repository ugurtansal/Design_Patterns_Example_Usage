package Music_List_App;

public interface SongVisitor {
    void visit(FreeSong song);
    void visit(PremiumSong song);
}

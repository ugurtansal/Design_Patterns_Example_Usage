package Music_List_App;

public class AccessChecker implements SongVisitor {
    private boolean isPremium;

    public AccessChecker(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public void visit(FreeSong song) {
        System.out.println("Free song is playing: " + song.getTitle());
    }

    public void visit(PremiumSong song) {
        if (isPremium) {
            System.out.println("Premium song is playing: " + song.getTitle());
        } else {
            System.out.println("This song is only available for premium users.");
        }
    }
}

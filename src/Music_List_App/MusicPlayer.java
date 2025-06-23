package Music_List_App;

import java.util.List;

public class MusicPlayer {
    private List<Song> playlist;
    private int currentIndex = 0;
    private PlayStrategy strategy;
    private boolean isPremium;

    public MusicPlayer(List<Song> playlist, PlayStrategy strategy, boolean isPremium) {
        this.playlist = playlist;
        this.strategy = strategy;
        this.isPremium = isPremium;
    }

    public void play() {
        Song current = playlist.get(currentIndex);
        current.accept(new AccessChecker(isPremium));
    }

    public void next() {
        currentIndex = strategy.getNextIndex(playlist, currentIndex);
        play();
    }

    public void previous() {
        currentIndex = strategy.getPreviousIndex(playlist, currentIndex);
        play();
    }

    public void setStrategy(PlayStrategy strategy) {
        this.strategy = strategy;
    }
}

package Music_List_App;

import java.util.List;
import java.util.Random;

 class SequentialPlay implements PlayStrategy {
    public int getNextIndex(List<Song> songs, int currentIndex) {
        return (currentIndex + 1) % songs.size();
    }

    public int getPreviousIndex(List<Song> songs, int currentIndex) {
        return (currentIndex - 1 + songs.size()) % songs.size();
    }
}

 class RepeatPlay implements PlayStrategy {
    public int getNextIndex(List<Song> songs, int currentIndex) {
        return currentIndex;
    }

    public int getPreviousIndex(List<Song> songs, int currentIndex) {
        return currentIndex;
    }
}

 class ShufflePlay implements PlayStrategy {
    private Random rand = new Random();

    public int getNextIndex(List<Song> songs, int currentIndex) {
        return rand.nextInt(songs.size());
    }

    public int getPreviousIndex(List<Song> songs, int currentIndex) {
        return rand.nextInt(songs.size());
    }
}


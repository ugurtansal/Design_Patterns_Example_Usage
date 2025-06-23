package Music_List_App;

import java.util.List;

public interface PlayStrategy {
    int getNextIndex(List<Song> songs, int currentIndex);
    int getPreviousIndex(List<Song> songs, int currentIndex);
}

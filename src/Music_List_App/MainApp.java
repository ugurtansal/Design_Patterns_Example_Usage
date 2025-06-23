package Music_List_App;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(
                new FreeSong("Hayat Bayram Olsa"),
                new PremiumSong("Kutup Yıldızı"),
                new FreeSong("Rüzgar"),
                new PremiumSong("Ay Işığı")
        );

        MusicPlayer player = new MusicPlayer(songs, new SequentialPlay(), false); // free user

        Command play = new PlayCommand(player);
        Command next = new NextCommand(player);
        Command prev = new PreviousCommand(player);

        play.execute();   // Song 1
        next.execute();   // Song 2 - premium
        next.execute();   // Song 3
        prev.execute();   // return song 2

        System.out.println("\n Shuffle Play List:\n");
        player.setStrategy(new ShufflePlay());
        next.execute();   // random song from the list
    }
}

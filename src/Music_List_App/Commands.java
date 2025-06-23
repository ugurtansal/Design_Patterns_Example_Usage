package Music_List_App;

 class PlayCommand implements Command {
    private MusicPlayer player;

    public PlayCommand(MusicPlayer player) {
        this.player = player;
    }

    public void execute() {
        player.play();
    }
}

 class NextCommand implements Command {
    private MusicPlayer player;

    public NextCommand(MusicPlayer player) {
        this.player = player;
    }

    public void execute() {
        player.next();
    }
}

 class PreviousCommand implements Command {
    private MusicPlayer player;

    public PreviousCommand(MusicPlayer player) {
        this.player = player;
    }

    public void execute() {
        player.previous();
    }
}

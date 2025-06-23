package Music_List_App;

 class FreeSong implements Song {
    private String title;

    public FreeSong(String title) {
        this.title = title;
    }

    public void accept(SongVisitor visitor) {
        visitor.visit(this);
    }

    public String getTitle() {
        return title;
    }
}

 class PremiumSong implements Song {
    private String title;

    public PremiumSong(String title) {
        this.title = title;
    }

    public void accept(SongVisitor visitor) {
        visitor.visit(this);
    }

    public String getTitle() {
        return title;
    }
}

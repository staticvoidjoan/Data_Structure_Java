package Challenge;

public class Song {
    private String SongTittle;
    private double SongDuration;

    public Song(String songTittle, double songDuration) {
        SongTittle = songTittle;
        SongDuration = songDuration;
    }

    public String getSongTittle() {
        return SongTittle;
    }

    public void setSongTittle(String songTittle) {
        SongTittle = songTittle;
    }

    public double getSongDuration() {
        return SongDuration;
    }

    public void setSongDuration(double songDuration) {
        SongDuration = songDuration;
    }

    @Override
    public String toString() {
        return
                "SongTittle='" + SongTittle + '\'' +
                ", SongDuration='" + SongDuration + '\'';
    }



}

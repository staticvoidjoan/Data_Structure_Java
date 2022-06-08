package Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String Name;
    private String Artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        Name = name;
        Artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String Tittle, double duration){
        if (findSong(Tittle) == null){
            this.songs.add(new Song(Tittle,duration));
            return true;
        }
        return false;

    }


    private Song findSong(String Tittle){
        for (Song checkedSong: this.songs){
            if (checkedSong.getSongTittle().equals(Tittle)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean AddToPlaylist(int TrackNumber, LinkedList<Song> playlist){
        int index = TrackNumber -1;
        if (index > 0 && index <= this.songs.size()){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + TrackNumber);
        return false;
    }



}

/**
 * File for a Song class to be used in the Playlist Project
 * @author Gitchler and GodOfGit
 * @version 1/16/2024
 */
import java.util.ArrayList;

public class Playlist 
{
    /**
     * declaring instance variables
     */
    private ArrayList<Song> Playlist;
    private ArrayList<Song> oneArtistPlaylist;
    private int duration;
    
    /**
     * public Playlist() is a constructor to create a new playlist, which is an ArrayList composed of Songs
     */
    public Playlist()
    {
        Playlist = new ArrayList<Song>();
    }
    /**
     * method add(Song newSong) creates a entry newSong in the ArrayList Playlist.
     * 
     * @param newSong The song object to be added to the ArrayList Playlist. 
     */
    public void add(Song newSong)
    {
        Playlist.add(newSong);
    }

    /**
     * method add(String title, String artist, String duration, Boolean like) is an overloaded method (add(Song newSong)) that creates a new Song object entry in the ArrayList Playlist with specified Song variables.
     * 
     * @param title The title of the Song object to be added to the ArrayList Playlist.
     * @param artist The artist of the Song object to be added to the ArrayList Playlist.
     * @param duration The duration of the Song object to be added to the ArrayList Playlist.
     * @param like The like status of the Song object to be added to the ArrayList Playlist.
     */
    
    public void add(String title, String artist, String duration, Boolean like)
    {
        Playlist.add(new Song(title, artist, duration, like));
    }
    
    /**
     * method like(Song likeSong) switches the current Boolean value of the Song's like boolean. 
     * @param likeSong the song object of which the Boolean value will be switched. 
     */
    public void like(Song likeSong)
    {
        likeSong.like();
    }
    
    /**
     * method remove(Song removeSong) removes a song object from the ArrayList Playlist.
     * @param removeSong the song object to be removed. 
     */
    public void remove(Song removeSong)
    {
        Playlist.remove(removeSong);
    }
    
    /**
     * method allSongs() returns the entire Playlist Arraylist.
     * 
     * @return Playlist the Arraylist of songs to be returned.
     */
    public ArrayList allSongs()
    {
        return Playlist;
    }
    
    /**
     * method displayAllSongs() prints out the title, artist, and duration of every song in the Playlist Arraylist.
     */
    public void displayAllSongs()
    {
        for (Song song : Playlist)
        {
            System.out.println("'" + song.getTitle() + "'" + " by " + song.getArtist() + 
            " (" + song.getTime() + ")");
        }
    }
    
    /**
     * method LikedSongs() prints out and identifies song objects with the Boolean value liked set as true. 
     */
    public void LikedSongs()
    {
        for (int i = 0; i < Playlist.size(); i++)
        {
            if (Playlist.get(i).isLiked() == true)
            {
                System.out.println("'" + Playlist.get(i).getTitle() + "'" + 
                " by "+ Playlist.get(i).getArtist() + 
                " (" + Playlist.get(i).getTime() + ")" + " -- liked");
            }
            else
            {
               System.out.println("'" + Playlist.get(i).getTitle() + "'" + 
                " by "+ Playlist.get(i).getArtist() + 
                " (" + Playlist.get(i).getTime() + ")"); 
            }
        }
    }
    
    /**
     * method displayLikedSongs() prints out only the song objects with the Boolean value liked set as true. 
     */
    public void displayLikedSongs()
    {
        for (int i = 0; i < Playlist.size(); i++)
        {
            if (Playlist.get(i).isLiked() == true)
            {
                System.out.println("'" + Playlist.get(i).getTitle() + "'" + 
                " by "+ Playlist.get(i).getArtist() + 
                " (" + Playlist.get(i).getTime() + ")" + " -- liked");
            }
        }
    }
    
    /**
     * method getDuration() calculates the total duration of all song objects in the Playlist Arraylist, adds them, and returns them.
     * 
     * @return time the total duration of all song objects in the Playlist Arraylist. 
     */
    public String getDuration()
    {
        for (int i = 0; i < Playlist.size(); i++)
        {
            duration += Playlist.get(i).getDurationInSeconds();
        }
        int mins = duration / 60;
        int secs = duration - (mins * 60);
        String time = (mins + ":" + secs);
        return time;
    }
    
    /**
     * method trim() removes song objects with the Boolean value liked set as false within the Playlist ArrayList. 
     */
    public void trim()
    {
        for (int i = 0; i < Playlist.size(); i++)
        {
            if (Playlist.get(i).isLiked() == false)
            {
                Playlist.remove(i);
            }
        }
    }

    /**
     * method reset() sets the Boolean value liked of all song objects within the Playlist ArrayList to false. 
     */
    public void reset()
    {
        for (Song song : Playlist)
        {
            if (song.isLiked() == true)
            {
                song.unlike();
            }
        }
    }

    /** 
     * method artistPlaylist(String goodArtist) creates a new ArrayList filled with songs of a given artist from the original ArrayList.
     * This function is based on a function I commonly use on Apple Music "smart playlist", where you can create a playlist of a specific artist's songs by inputting the artist. 
     * 
     * @param goodArtist the artist whose songs will populate the new ArrayList
     */
    public ArrayList artistPlaylist(String goodArtist)
    {
        oneArtistPlaylist = new ArrayList<Song>();
        for (Song song : Playlist)
        {
            if (song.getArtist() == goodArtist)
            {
                oneArtistPlaylist.add(song);
                System.out.println(song);
            }
        }
        return oneArtistPlaylist;
    }
}


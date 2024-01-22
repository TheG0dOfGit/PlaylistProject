/**
 * File for a Song class to be used in the Playlist Project
 * @author Gitchler and GodOfGit
 * @version 1/16/2024
 */
import java.util.ArrayList;

public class Playlist 
{
    private ArrayList<Song> Playlist;
    private int duration;
    
    public Playlist()
    {
        Playlist = new ArrayList<Song>();
    }
    
    public void add(Song newSong)
    {
        Playlist.add(newSong);
    }
    
    public void add(String title, String artist, String duration, Boolean like)
    {
        Playlist.add(new Song(title, artist, duration, like));
    }
    
    public void like(Song likeSong)
    {
        likeSong.like();
    }
    
    public void remove(Song removeSong)
    {
        Playlist.remove(removeSong);
    }
    
    public ArrayList allSongs()
    {
        return Playlist;
    }
    
    public void displayAllSongs()
    {
        for (Song song : Playlist)
        {
            System.out.println("'" + song.getTitle() + "'" + " by " + song.getArtist() + 
            " (" + song.getTime() + ")");
        }
    }
    
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
}


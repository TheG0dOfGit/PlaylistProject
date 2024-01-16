/**
 * File for a Song class to be used in the Playlist Project
 * @author Gitchler and GodOfGit
 * @version 1/16/2024
 */
public class Song {
    //Fields-- what information do we want each Song to store?
private String title;
private double mins;
private double secs;
private String artist;
private boolean like;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song (name, mins, secs, artist, like)
    {
        this.name = name;
        this.mins = mins;
        this.secs = secs;
        this.artist = artist;
        like = false;
    }



     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

      public String getTitle(title)
      {
        return title;
      }

      public double getDuration(title)
      {
        return minutes;
        return seconds;
      }

      public String getArtist(title)
      {
        return artist;
      }

      public boolean isLiked()
      {
        return like;
      }

      public void like()
      {
        like = true;
      }

      public void unlike()
      {
        like = false;
      }
}

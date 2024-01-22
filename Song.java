/**
 * File for a Song class to be used in the Playlist Project
 * @author Gitchler and GodOfGit
 * @version 1/16/2024
 */
public class Song 
{
    //Fields-- what information do we want each Song to store?
    private String title;
    private String duration;
    private String artist;
    private boolean like;
    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song (String title, String duration, String artist, boolean like)
    {
        this.title = title;
        this.duration = duration;
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
   
      public String getTitle()
      {
        return title;
      }
    public String getTime()
      {
          return duration;
      }
    public int getDurationInSeconds()
      {
        int seconds = 0;
        String minutesPart = duration.substring(0, duration.indexOf(":"));
        seconds += Integer.parseInt(minutesPart) * 60;
        String secondsPart = duration.substring(duration.indexOf(":")+1);
        seconds += Integer.parseInt(secondsPart);
        return seconds;
      }
    public String getArtist()
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

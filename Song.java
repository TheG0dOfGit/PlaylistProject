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
     * Constructs a song under a certain title, duration, artist, and like status
     */
    public Song (String title, String duration, String artist, boolean like)
    {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        like = false;
    }
    /**
      * The getTitle method gets the title of a chosen song
      * @return title the title of a particular song
      */
   
      public String getTitle()
      {
        return title;
      }
    /**
     * The getTime method gets the duration of the referred song
     * @return duration the duration of a particular song
     */
      public String getTime()
      {
          return duration;
      }
    /**
     * The getDurationInSeconds method converts a string duration into an int value
     * @return seconds the int number of seconds of a particular song
     */
      public int getDurationInSeconds()
      {
        int seconds = 0;
        String minutesPart = duration.substring(0, duration.indexOf(":"));
        seconds += Integer.parseInt(minutesPart) * 60;
        String secondsPart = duration.substring(duration.indexOf(":")+1);
        seconds += Integer.parseInt(secondsPart);
        return seconds;
      }
    /**
     * The getArtist method gets the artist of a certain song
     * @return artist the artist of a particular song
     */
      public String getArtist()
      {
        return artist;
      }
    /**
     * The isLiked method marks a particular song as "liked" within the playlist
     * @return like the confirmation of a song under "liked" status
     */
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
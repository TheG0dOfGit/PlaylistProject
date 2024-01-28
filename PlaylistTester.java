/**
 * Write a description of class PlaylistTester here.
 *
 * @author Gitchler and GodOfGit
 * @version 1/19/2024
 */
import java.util.ArrayList;

public class PlaylistTester
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        Playlist Lads = new Playlist();
        System.out.println("Initializing a playlist...");
        System.out.println();
        System.out.println("Adding songs to the playlist...");
        System.out.println();
        
        Song Seventeen = new Song ("Seventeen", "4:05", "Winger",false);
        Lads.add(Seventeen);
        System.out.println("Added 'Seventeen' by Winger (4:05)");
        Song Women = new Song ("Women", "5:41", "Def Leppard", false);
        System.out.println("Added 'Women' by Def Leppard (5:41)");
        Lads.add(Women);
        Song Summer69 = new Song("Summer of '69", "3:36", "Bryan Adams", false);
        Lads.add(Summer69);
        System.out.println("Added 'Summer of '69' by Bryan Adams (3:36)");
        Song DogBone = new Song("Givin' the Dog a Bone", "3:30", "AC/DC", false);
        Lads.add(DogBone);
        System.out.println("Added 'Givin' the Dog a Bone' by AC/DC (3:30)");
        Song Panama = new Song("Panama", "3:31", "Van Halen", false);
        Lads.add(Panama);
        System.out.println("Added 'Panama' by Van Halen (3:31)");
        Song WalkThisWay = new Song("Walk This Way", "3:40", "Aerosmith", false);
        Lads.add(WalkThisWay);
        System.out.println("Added 'Walk This Way' by Aerosmith (3:40)");
        System.out.println();
        Song ShootToThrill = new Song("Shoot to Thrill", "5:17", "AC/DC", false);
        Lads.add(ShootToThrill);
        System.out.println("Added 'Shoot to Thrill' by AC/DC (5:17)");
        System.out.println();
        
        System.out.println("Printing the songs...");
        System.out.println();
        Lads.displayAllSongs();
        System.out.println();
        
        System.out.println("Liking the songs in positions 1, 3 and 4...");
        Lads.like((Song) Lads.allSongs().get(1));
        Lads.like((Song) Lads.allSongs().get(3));
        Lads.like((Song) Lads.allSongs().get(4));
        System.out.println();
        System.out.println("Printing the songs...");
        System.out.println();
        Lads.LikedSongs();
        System.out.println();
        
        System.out.println("Removing the song in position 2...");
        System.out.println();
        Lads.remove((Song) Lads.allSongs().get(2));
        System.out.println("Printing the songs...");
        System.out.println();
        Lads.displayAllSongs();
        System.out.println();
        
        System.out.println("Printing only the liked songs...");
        System.out.println();
        Lads.displayLikedSongs();
        System.out.println();

        System.out.println("Printing the total duration of all songs...");
        System.out.println(Lads.getDuration());
        System.out.println();
        
        System.out.println("Removing all unliked songs at once...");
        Lads.trim();
        System.out.println();
        System.out.println("Printing all songs...");
        System.out.println();
        Lads.displayAllSongs();
        
        System.out.println("");


        System.out.println("Now beginning experimental tests (not within the requirements)");

        System.out.println("Resetting like status of all songs");

        Lads.reset();

        System.out.println("Printing out liked songs (should be none)");

        Lads.displayLikedSongs();

        System.out.println("Creating an AC/DC playlist out of the songs in the Lads playlist");
        Lads.artistPlaylist("AC/DC");
    }
}


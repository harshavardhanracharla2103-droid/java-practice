import java.util.LinkedList;
import java.util.Scanner;

class Song {
    String title;
    String genre;
    String artist;
    int duration;

    // Constructor
    public Song(String title, String genre, String artist, int duration) {
        this.title = title;
        this.genre = genre;
        this.artist = artist;
        this.duration = duration;
    }

    // Display method
    public void display() {
        System.out.println("Title: " + title + ", Genre: " + genre +
                           ", Artist: " + artist + ", Duration: " + duration + " sec");
    }
}

public class Playlist {
    public static void main(String[] args) {
        System.out.println("Welcome to my playlist");

        LinkedList<Song> songs = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of songs to add: ");
        int n = sc.nextInt();
        sc.nextLine();  // Clean up newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Title of the song: ");
            String title = sc.nextLine();

            System.out.print("Enter Genre of the song: ");
            String genre = sc.nextLine();

            System.out.print("Enter Artist of the song: ");
            String artist = sc.nextLine();

            System.out.print("Enter Duration of the song (in sec): ");
            int duration = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            // Create Song object and add
            Song song = new Song(title, genre, artist, duration);
            songs.add(song);
        }

        System.out.println("\nPlaylist:");
        for (Song s : songs) {
            s.display();  // print each song info
        }

        sc.close();
    }
}


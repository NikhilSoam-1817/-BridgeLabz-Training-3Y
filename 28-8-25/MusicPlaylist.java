import java.util.Scanner;

public class MusicPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] songs = {"Song1", "Song2", "Song3"};
        boolean running = true;

        while (running) {
            System.out.println("1. Play All\n2. Play by Index\n3. Search\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (String song : songs) {
                        System.out.println("Playing: " + song);
                    }
                    break;
                case 2:
                    System.out.println("Enter index:");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < songs.length) {
                        System.out.println("Playing: " + songs[idx]);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.println("Enter song name:");
                    String name = sc.next();
                    boolean found = false;
                    for (String song : songs) {
                        if (song.equalsIgnoreCase(name)) {
                            System.out.println("Found: " + song);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Song not found.");
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
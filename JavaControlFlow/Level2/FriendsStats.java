import java.util.Scanner;

public class FriendsStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageAmar = sc.nextInt(), heightAmar = sc.nextInt();
        int ageAkbar = sc.nextInt(), heightAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt(), heightAnthony = sc.nextInt();

        String youngest = (ageAmar < ageAkbar && ageAmar < ageAnthony) ? "Amar" :
                          (ageAkbar < ageAnthony) ? "Akbar" : "Anthony";

        String tallest = (heightAmar > heightAkbar && heightAmar > heightAnthony) ? "Amar" :
                         (heightAkbar > heightAnthony) ? "Akbar" : "Anthony";

        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);
    }
}
import java.util.Scanner;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seatsAvailable = 5;
        int waitingList = 0;
        int choice;

        do {
            System.out.println("Select Train:\n1. Express - ₹1000\n2. Local - ₹500");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Express selected.");
                    break;
                case 2:
                    System.out.println("Local selected.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            for (int i = 0; i < 1; i++) {
                if (seatsAvailable > 0) {
                    System.out.println("Seat booked.");
                    seatsAvailable--;
                } else {
                    System.out.println("Added to waiting list.");
                    waitingList++;
                }
            }
        } while (seatsAvailable > 0);
    }
}
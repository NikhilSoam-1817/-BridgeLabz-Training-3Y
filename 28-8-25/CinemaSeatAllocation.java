public class CinemaSeatAllocation {
    public static void main(String[] args) {
        int[][] seats = new int[5][10]; // 0 = empty, 1 = booked
        boolean booked = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 7; j++) {
                if (seats[i][j] == 0 && seats[i][j + 1] == 0 && seats[i][j + 2] == 0) {
                    seats[i][j] = seats[i][j + 1] = seats[i][j + 2] = 1;
                    System.out.println("Seats booked at Row " + (i + 1) + ", Seats " + (j + 1) + "-" + (j + 3));
                    booked = true;
                    break;
                }
            }
            if (booked) break;
        }

        if (!booked) {
            System.out.println("Not available");
        }
    }
}
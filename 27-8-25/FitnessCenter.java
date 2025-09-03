import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean centerOpen = true;

        do {
            System.out.println("Select Membership:\n1. Monthly\n2. Quarterly\n3. Yearly");
            int type = sc.nextInt();
            double fee = 0;

            switch (type) {
                case 1:
                    fee = 1000;
                    break;
                case 2:
                    fee = 2500;
                    break;
                case 3:
                    fee = 9000;
                    break;
                default:
                    System.out.println("Invalid type.");
            }

            System.out.println("Enter number of members:");
            int numMembers = sc.nextInt();

            for (int i = 0; i < numMembers; i++) {
                System.out.println("Is member eligible for discount? (student/senior) yes/no");
                String eligible = sc.next();
                double finalFee = fee;
                if (eligible.equalsIgnoreCase("yes")) {
                    finalFee *= 0.9;
                }
                System.out.println("Final fee for member " + (i + 1) + ": ₹" + finalFee);
            }

            System.out.println("Continue registration? (yes/no)");
            centerOpen = sc.next().equalsIgnoreCase("yes");
        } while (centerOpen);
    }
}
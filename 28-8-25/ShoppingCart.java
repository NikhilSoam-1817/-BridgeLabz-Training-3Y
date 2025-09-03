import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean moreCustomers = true;

        while (moreCustomers) {
            int total = 0;
            int item;
            String addMore;

            do {
                System.out.println("Select Product:\n1. Shoes ₹2000\n2. Bag ₹3000\n3. Watch ₹4000");
                item = sc.nextInt();
                switch (item) {
                    case 1:
                        total += 2000;
                        break;
                    case 2:
                        total += 3000;
                        break;
                    case 3:
                        total += 4000;
                        break;
                    default:
                        System.out.println("Invalid product.");
                }
                System.out.println("Add another item? (yes/no)");
                addMore = sc.next();
            } while (addMore.equalsIgnoreCase("yes"));

            if (total > 5000) {
                total *= 0.9;
                System.out.println("Discount applied.");
            }

            System.out.println("Final Bill: ₹" + total);
            System.out.println("Next customer? (yes/no)");
            moreCustomers = sc.next().equalsIgnoreCase("yes");
        }
    }
}
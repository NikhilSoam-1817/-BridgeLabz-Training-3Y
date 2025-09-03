import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Frequency array for digits 0–9
        int[] frequency = new int[10];

        // Extract digits and update frequency
        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Display frequency of each digit
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
    }
}
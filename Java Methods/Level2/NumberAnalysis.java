import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number " + (i + 1) + " (" + num + "): ");
            if (isPositive(num)) {
                System.out.println("Positive and " + (isEven(num) ? "Even" : "Odd"));
            } else {
                System.out.println("Negative");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison between first and last number: ");
        if (result == 1) {
            System.out.println("First number is greater than last");
        } else if (result == 0) {
            System.out.println("First and last numbers are equal");
        } else {
            System.out.println("First number is less than last");
        }
    }
}
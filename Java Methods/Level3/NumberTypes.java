public class NumberTypes {

    // Method to calculate sum of proper divisors
    public static int sumProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    // Check if number is Perfect
    public static boolean isPerfect(int num) {
        return sumProperDivisors(num) == num;
    }

    // Check if number is Abundant
    public static boolean isAbundant(int num) {
        return sumProperDivisors(num) > num;
    }

    // Check if number is Deficient
    public static boolean isDeficient(int num) {
        return sumProperDivisors(num) < num;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    // Check if number is Strong
    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }

    // Main method to test
    public static void main(String[] args) {
        int number = 145; // You can change this to test other numbers

        System.out.println("Number: " + number);
        System.out.println("Perfect Number: " + isPerfect(number));
        System.out.println("Abundant Number: " + isAbundant(number));
        System.out.println("Deficient Number: " + isDeficient(number));
        System.out.println("Strong Number: " + isStrong(number));
    }
}
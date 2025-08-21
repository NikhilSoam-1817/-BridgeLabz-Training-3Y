import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a (int): ");
        int a = input.nextInt();

        System.out.print("Enter value for b (int): ");
        int b = input.nextInt();

        System.out.print("Enter value for c (int): ");
        int c = input.nextInt();

        // Operator precedence matters here
        int result1 = a + b * c;        // Multiplication before addition
        int result2 = a * b + c;        // Multiplication before addition
        int result3 = c + a / b;        // Division before addition
        int result4 = a % b + c;        // Modulus before addition

        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
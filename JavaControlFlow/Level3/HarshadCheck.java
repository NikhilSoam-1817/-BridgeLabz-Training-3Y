import java.util.Scanner;

public class HarshadCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0, temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println(number + " is " + (number % sum == 0 ? "a Harshad Number" : "not a Harshad Number"));
    }
}
public class DigitAnalysis {

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        return num % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int number = 21;
        int[] digits = NumberChecker.getDigits(number);

        System.out.println("Sum of Digits: " + sumDigits(digits));
        System.out.println("Sum of Squares: " + sumSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] row : freq) {
            if (row[1] > 0) System.out.println("Digit " + row[0] + ": " + row[1]);
        }
    }
}
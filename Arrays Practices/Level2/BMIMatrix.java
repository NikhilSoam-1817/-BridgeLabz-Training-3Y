import java.util.Scanner;

public class BMIMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble() / 100;
            double bmi = weight / (height * height);

            personData[i][0] = height * 100;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 40) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height=" + personData[i][0] + "cm, Weight=" + personData[i][1] + "kg, BMI=" + personData[i][2] + ", Status=" + weightStatus[i]);
        }
    }
}
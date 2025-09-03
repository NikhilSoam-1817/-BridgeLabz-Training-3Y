public class EmployeeSalary {
    public static void main(String[] args) {
        String[] names = {"Amit", "Neha", "Raj"};
        int[] basic = {40000, 55000, 30000};

        for (int i = 0; i < names.length; i++) {
            double hra = basic[i] * 0.2;
            double da = basic[i] * 0.1;
            double net = basic[i] + hra + da;

            if (net > 50000) {
                net *= 0.9; // Apply 10% tax
            }

            System.out.println("Salary Slip for " + names[i]);
            System.out.println("Basic: ₹" + basic[i]);
            System.out.println("HRA: ₹" + hra);
            System.out.println("DA: ₹" + da);
            System.out.println("Net Salary: ₹" + net);
            System.out.println("---------------------------");
        }
    }
}
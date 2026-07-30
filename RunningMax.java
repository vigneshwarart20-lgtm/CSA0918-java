import java.util.Scanner;

public class RunningMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values (N): ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input! N must be greater than 0.");
            } else {
                System.out.println("Enter " + n + " values:");

                // Read the first value to initialize the running maximum
                double max = sc.nextDouble();
                System.out.println("Running maximum: " + max);

                // Read remaining N - 1 values
                for (int i = 1; i < n; i++) {
                    double val = sc.nextDouble();
                    if (val > max) {
                        max = val;
                    }
                    System.out.println("Running maximum: " + max);
                }
            }
        } else {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
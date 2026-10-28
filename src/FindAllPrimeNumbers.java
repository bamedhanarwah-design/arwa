import java.util.Scanner;

public class FindAllPrimeNumbers {
    
     public static void main(String[] args) {
        // Create a Scanner object to read input from the terminal
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of N
        System.out.print("Enter the maximum number (N): ");
        int N = scanner.nextInt();

        System.out.println("Output:");
        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;

            // Optimization: Only check divisors up to the square root of 'num'
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit the loop early if a divisor is found
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Print a new line at the end

        // Close the scanner resource
        scanner.close();
    }
}

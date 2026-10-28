import java.util.Scanner;

public class EvenNumberSum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input N = ");
        int N = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i;
            }
        }
        
        System.out.println("Output: Sum of even numbers = " + sum);
        
        scanner.close();
    }
}


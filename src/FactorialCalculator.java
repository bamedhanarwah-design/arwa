import java.util.Scanner;

public class FactorialCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input N = ");
        int N = scanner.nextInt();
        
        long factorial = 1; // Using long to handle larger numbers
        
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        
        System.out.println("Output: " + N + "! = " + factorial);
        
        scanner.close();
    }
}


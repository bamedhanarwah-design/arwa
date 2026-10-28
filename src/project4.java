import java.util.Scanner;

public class NumberTriangle {
    
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input N = ");
        int N = scanner.nextInt();
        
        System.out.println("Output:");
        // Outer loop to control the number of rows
        for (int i = 1; i <= N; i++) {
            // Inner loop to print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line
        }
        
        scanner.close();
    }
} 


import java.util.Scanner;

public class RectangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input R = ");
        int R = scanner.nextInt();
        System.out.print("Input C = ");
        int C = scanner.nextInt();
        
        System.out.println("Output:");
        // Outer loop to control rows
        for (int i = 1; i <= R; i++) {
            // Inner loop to print characters per row
            for (int j = 1; j <= C; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
        
        scanner.close();
    }
}
            

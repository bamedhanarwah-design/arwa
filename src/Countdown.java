import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input N = ");
        int N = scanner.nextInt();
        
        System.out.println("Output:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nStart!");
        
        scanner.close();
    }
}

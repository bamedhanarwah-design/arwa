import java.util.Scanner;

public class Countingsequence {
 
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input N = ");
        int N = scanner.nextInt();
        
        System.out.print("Output: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}


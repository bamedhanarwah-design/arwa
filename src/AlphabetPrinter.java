import java.util.Scanner;

public class AlphabetPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            char letter = (char) ('A' + i);
            System.out.print(letter + "");
            
        }


    }
}
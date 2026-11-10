import java.util.Scanner;

public class AlphabetPrintermaryam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print((char) ('A' + i) + " ");

        }
        System.out.println();

        input.close();
    }
}
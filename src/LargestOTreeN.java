import java.util.Scanner;
public class LargestOTreeN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a = input.nextInt();

        System.out.print("Enter second number");
        int b = input.nextInt();

        System.out.print("Enter third number");
        int c = input.nextInt();

        if (a == b && b == c) {
            System.out.println("All numbers are Equal");
        } else if (a >= b && a >= c) {
            System.out.println("Largest = " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest = " + b);
        } else {
            System.out.println("Largest = " + c);
        }
    }
}

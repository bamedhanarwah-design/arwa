import java.util.Scanner;

public class SimpleCalculatormaryam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        char operator = input.next().charAt(0);
        double num2 = input.nextDouble();

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out. println(num1 * num2);
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Error: Division by Zero");
            } else {
                System.out.println(num1 / num2);

            }
        } else {
            System.out.println("Invalid Operator");
        }

        input.close();

    }
}
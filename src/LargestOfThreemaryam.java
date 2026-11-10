import java.util.Scanner;

public class LargestOfThreemaryam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All Numbers Are Equal");
        } else {
            int max = num1;
            if (num2 > max) {
                max = num2;
            }
            if (num3 > max) {
                max = num3;
            }
            System.out.println(max);
        }

        input.close();
    }
}

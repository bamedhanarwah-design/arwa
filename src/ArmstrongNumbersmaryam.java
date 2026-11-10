import java.util.Scanner;

public class ArmstrongNumbersmaryam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int digits = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = i;
            int sum = 0;
            while (temp > 0) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, digits);
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        input.close();
    }
}

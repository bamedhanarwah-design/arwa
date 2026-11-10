import java.util.Scanner;

public class WaterTankFillingmaryam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        int f = input.nextInt();

        int currentVolume = 0;
        while (currentVolume < c) {
            currentVolume += f;
            if (currentVolume > c) {
                currentVolume = c;
            }
            System.out.print(currentVolume + " ");
        }
        System.out.println("Tank Full");

        input.close();
    }
}
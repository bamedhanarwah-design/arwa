import java.util.Scanner;

public class WaterTankFelling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter capacity: ");
        int c = input.nextInt();

        System.out.print("Enter filling rate: ");
        int f = input.nextInt();

        int volume = 0;

        while (volume < c) {
            volume += f;

            if (volume > c) {
                volume = c;
            }

            System.out.print(volume + " ");

         }

         System.out.println("Tank Full");
        }
    }
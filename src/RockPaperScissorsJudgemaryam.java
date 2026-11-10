import java.util.Scanner;

public class RockPaperScissorsJudgemaryam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String p1 = input.next();
        String p2 = input.next();

        if ((!p1.equals("rock") && !p1.equals("paper") && !p1.equals("scissors")) ||
            (!p2.equals("rock") && !p2.equals("paper") && !p2.equals("scissors"))) {
            System.out.println("Invalid Input");
        } else if (p1.equals(p2)) {
            System.out.println("Draw");
        } else if ((p1.equals("rock") && p2.equals("scissors")) ||
                   (p1.equals("paper") && p2.equals("rock")) ||
                   (p1.equals("scissors") && p2.equals("paper"))) {
            System.out.println("Player 1 Wins");
        } else {
            System.out.println("Player 2 Wins");
        }

        input.close();
    }
}

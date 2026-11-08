import java.util.Scanner;
public class VowelCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence:");
        String text = input.nextLine();

        int count = 0;

        for (int i = 0; i < text.length() ; i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                    count++;
                }
        }

        System.out.println("Vowels = " + count);
    }
}

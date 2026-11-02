import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListAtm {
    public static void main(String[] args) {
        Scanner inputY = new Scanner(System.in);
        int balance = 1000000;
        
        ArrayList<Integer> transaction = new ArrayList<>();
        System.out.print("Navigation \n1)Deposit \n2)Withdrawal \n3)Check Balance \n4)Amount Deposited \n5)Amount withdrawn \n6)Transactions \n0)Exit\n");
        do {
            System.out.print("\nSelect Menu: ");
            int menu = inputY.nextInt();
            if (menu == 0) {
                break;
            } else if (menu == 1) {
                System.out.print("Input amount: ");
                int amount = inputY.nextInt();
                if (amount <= 0) {
                    System.out.println("Invalid amount");
                    continue;
                }
                balance += amount;
                transaction.add(amount);
            } else if (menu == 2) {
                System.out.print("Input amount : ");
                int amount = inputY.nextInt();
                if (amount <= 0) {
                    System.out.println("Invalid amount");
                    continue;
                }
                if (balance < amount) {
                    System.out.println("Insufficient amout, your balance is " + balance);
                    continue;
                }
                balance -= amount;
                transaction.add(-amount);
            } else if (menu == 3) {
                System.out.println("Balance: " + balance);
            } else if (menu == 4) {
                int totalDeposit = 0;
                for (int t : transaction) {
                    if (t > 0) {
                        totalDeposit += t;
                    }
                }
                System.out.println("Total Deposit: " + totalDeposit);
            } else if (menu == 5) {
                int totalWithdrawn = 0;
                for (int t : transaction) {
                    if (t < 0) {
                        totalWithdrawn += -t;
                    }
                }
                System.out.println("Total Withdrawn: " + totalWithdrawn);
            } else if (menu == 6) {
                System.out.println("Transaction History:");
                for (int i = 0; i < transaction.size(); i++) {
                    System.out.println((i + 1) + ". " + transaction.get(i));
                }
            } else {
                System.out.println("Invalid menu");
            }
        } while (true);
        System.out.println("Thank you for using ATM.");
        inputY.close();
    }
}

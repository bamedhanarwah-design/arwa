import java.util.Scanner;
 
public class ATMSimulation {
    public static void main(String[] args) {
        Scanner inputY = new Scanner(System.in);
        int balance = 1000000;
        int[] transactions = new int[5];
        int historyIndex = 0;
        int totalDeposited = 0;
        int totalWithdrawn = 0;
        System.out.print("Navigation \n1)Deposit \n2)Withdrawal \n3)Check Balance \n4)Amount Deposited \n5)Amount withdrawn \n6)Transactions \n0)Exit\n");
        do {
            System.out.print("\nSelect Menu: ");
            int menu = inputY.nextInt();
            if ((menu == 1 || menu == 2) && historyIndex == 5) {
                System.out.println("Transaction full");
                continue;
            }
            if (menu == 0) {
                break;
            }else if (menu == 1) {
                System.out.print("Input amount: ");
                int amount = inputY.nextInt();
                if (amount <= 0) {
                    System.out.println("Amount must be greater than 0");
                    continue;
                }
                balance += amount;
                totalDeposited += amount;
                transactions[historyIndex++] = amount;
            }else if (menu == 2) {
                System.out.print("Input amount: ");
                int amount = inputY.nextInt();
                if (amount <= 0) {
                    System.out.println("Amount must be greater than 0");
                    continue;
                }
                if (balance < amount) {
                    System.out.println("Insufficient balance, your balance is " + balance);
                    continue;
                }
                balance -= amount;
                totalWithdrawn += amount;
                transactions[historyIndex++] = -amount;
            }else if (menu == 3) {
                System.out.println("Balance: " + balance);
            }else if (menu == 4) {
                System.out.println("Total deposited: " + totalDeposited);
            }else if (menu == 5) {
                System.out.println("Total withdrawn: " + totalWithdrawn);
            }else if (menu == 6) {
                for (int i = 0; i < historyIndex; i++) {
                    System.out.println((i + 1) + " " + transactions[i]);
                }
            }else {
                System.out.println("Menu not available");
            }
        }while(true);
    }
}
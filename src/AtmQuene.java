import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class AtmQuene {
    public static void main(String[] args) {
        Scanner inputY = new Scanner(System.in);
        int balance = 1000000;
        
        // Menggunakan Queue untuk menampung riwayat transaksi
        Queue<Integer> transactions = new LinkedList<>();
        int maxHistory = 5;

        System.out.print("Navigation \n1)Deposit \n2)Withdrawal \n3)Check Balance \n4)Amount Deposited \n5)Amount withdrawn \n6)Transactions \n0)Exit\n");
        
        do {
            System.out.print("\nSelect Menu: ");
            int menu = inputY.nextInt();
            
            if (menu == 0) {
                break;
            } else if (menu == 1) {
                System.out.print("Input amount: ");
                int amount = inputY.nextInt();
                balance += amount;
                
                // Jika antrean penuh, hapus transaksi tertua (paling pertama masuk)
                if (transactions.size() == maxHistory) {
                    transactions.poll();
                }
                transactions.add(amount); // Nilai positif untuk Deposit
                
            } else if (menu == 2) {
                System.out.print("Input amount: ");
                int amount = inputY.nextInt();
                if (balance < amount) {
                    System.out.print("insufficient amount, your balance is " + balance);
                    continue;
                }
                balance -= amount;
                
                // Jika antrean penuh, hapus transaksi tertua
                if (transactions.size() == maxHistory) {
                    transactions.poll();
                }
                transactions.add(-amount); // Nilai negatif untuk Withdrawal
                
            } else if (menu == 3) {
                System.out.print("Balance: " + balance);
                
            } else if (menu == 4) {
                int totalDeposit = 0;
                // Melakukan perulangan (foreach) pada struktur Queue
                for (int t : transactions) {
                    if (t > 0) {
                        totalDeposit += t;
                    }
                }
                System.out.print("Total Deposit: " + totalDeposit);
                
            } else if (menu == 5) {
                int totalWithdrawn = 0;
                for (int t : transactions) {
                    if (t < 0) {
                        totalWithdrawn += t; // Menambahkan nilai negatif langsung
                    }
                }
                // Diubah menjadi positif saat dicetak agar rapi (menggunakan Math.abs)
                System.out.print("Total Withdrawn: " + Math.abs(totalWithdrawn));
                
            } else if (menu == 6) {
                int index = 1;
                if (transactions.isEmpty()) {
                    System.out.print("No transactions yet.");
                } else {
                    for (int t : transactions) {
                        System.out.println(index + ") " + (t > 0 ? "Deposit: +" : "Withdrawal: ") + t);
                        index++;
                    }
                }
            }
        } while (true);
        
        System.out.println("Thank you for using ATM.");
        inputY.close();
    }   
}
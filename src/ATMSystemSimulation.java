public class ATMSystemSimulation {
    public static void main(String[] args) {
        int balance = 500000; 
        int[] transactions = {200000, -100000, -700000, 300000, -50000}; 

        for (int tx : transactions) {
            if (balance + tx < 0) {
                System.out.println("Transaction rejected: Insufficient balance for " + tx);
                continue; 
            }
            balance += tx;
            System.out.println("Transaction successful. Current balance: " + balance);
        }
        System.out.println("Final Balance: " + balance);
    }
}
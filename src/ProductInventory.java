public  class ProductInventory {
    public static void main(String[] args) {
        int[] stock = {12, 8, 15, 6};

        // 1. Display the stock of the first and last products
        System.out.println("First: " + stock[0] + ", Last: " + stock[stock.length - 1]);

        // 2 & 3. Change the stock of the second product to 10 and display all
        stock[1] = 10;
        System.out.print("Updated stock: ");
        for (int s : stock) System.out.print(s + " ");
        System.out.println();

        // 4. Explanation for stock[4]:
        // It will trigger an "ArrayIndexOutOfBoundsException" error because the maximum valid index is 3.
    }
}
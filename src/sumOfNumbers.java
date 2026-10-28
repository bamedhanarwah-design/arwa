class Sumofnumbers {
    public static void hitung(int n) {
       int sum = 0;  // Accumulator variable

       for (int i = 1; i <= n; i++) {
          sum += i;
       }
       System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
       hitung(5);
    }
}



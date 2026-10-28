public class FindPairsWithaTargetSum {

    public static void main(String[] args) {
        int[] data = {2, 4, 3, 5, 7, 8, 9};
        int target = 10;

        System.out.println("Output");
        // Nested loops to find unique  pairs
        for (int i = 0; i < data.length; i++) {
            for (int j = i + i; j < data.length; j++) {
                if (data[i] + data[j] == target) {
                    System.out.println("(" + data[i] + ", " + data[j] + ")");
                }
            }
        }
    }
}

public class CompareSearchEfficiency {
     
    public static void main(String[] args) {
        // 1 & 2. Explanations and Big-O Time Complexities [Ref: Page 5]
        System.out.println("1. Linear Search checks elements sequentially from start to end.");
        System.out.println("   Binary Search repeatedly divides a sorted search space in half.");
        System.out.println("2. Time Complexities: Linear = O(n), Binary = O(log n)");

        // 3. Maximum checks for 10,000 elements [Ref: Page 5]
        System.out.println("3. Maximum checks required by Linear Search = 10,000 checks");

        // 4 & 5. Constraints and Use Cases [Ref: Page 5]
        System.out.println("4. Binary Search fails on unsorted arrays because it relies on ordering logic.");
        System.out.println("5. Linear Search is ideal for small datasets or completely unsorted arrays.");
    }
}

public class ProductSearch {
    
    public static void main(String[] args) {
        int[] codes = {101, 105, 110, 115, 120, 125};
        int target = 115; // Example target code to search for
        int foundIndex = -1;
        int checkedCount = 0;

        for (int i = 0; i < codes.length; i++) {
            checkedCount++;
            if (codes[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Found at index: " + foundIndex);
        } else {
            System.out.println("Product is unavailable.");
        }
        System.out.println("Elements checked: " + checkedCount);
    }
}

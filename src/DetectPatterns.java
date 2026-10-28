public class DetectPatterns {
    public static void main(String[] args) {
        int[] usage = {120, 125, 130, 128, 135, 140, 138, 145};

        int increaseCount = 0;
        int maxChange = 0;

        // Loop starts from index 1 to compare with the previous day
        for (int i = 1; i < usage.length; i++) {
            // 1. Count how many times usage increases compared to the previous day [Ref: Page 5]
            if (usage[i] > usage[i - 1]) {
                increaseCount++;
            }

            // 3. Find the largest change between two consecutive days [Ref: Page 5]
            int change = Math.abs(usage[i] - usage[i - 1]);
            if (change > maxChange) {
                maxChange = change;
            }
        }

        System.out.println("1. Number of usage increases: " + increaseCount + " times");
        System.out.println("3. Largest change between consecutive days: " + maxChange + " kWh");
        
        // 4. Overall trend conclusion [Ref: Page 5]
        System.out.println("4. Overall trend: Upward (since the final value 145 is larger than the starting value 120).");
    }
}


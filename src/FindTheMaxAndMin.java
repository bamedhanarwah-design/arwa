public class FindTheMaxAndMin {
    public static void main(String[] args) {
        int[] temps = {29, 32, 27, 35, 31, 26, 34};
        int max = temps[0], min = temps[0];
        int maxIdx = 0, minIdx = 0;

        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > max) { max = temps[i]; maxIdx = i; }
            if (temps[i] < min) { min = temps[i]; minIdx = i; }
        }

        System.out.println("Highest: " + max + " (Index " + maxIdx + ")");
        System.out.println("Lowest: " + min + " (Index " + minIdx + ")");
        System.out.println("Difference: " + (max - min));
    }
}
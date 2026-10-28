import java.util.Arrays;

public class PredictTheOutputAndFindTheBug {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};

        // Running the original symmetry modification loop [Ref: Page 5]
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] + data[data.length - 1 - i];
        }

        // 1. Program output [Ref: Page 5]
        System.out.println("1. Output: " + Arrays.toString(data));

        // 4. Design a fix [Ref: Page 5]
        int[] original = {1, 2, 3, 4, 5};
        int[] fixedData = new int[original.length];
        
        // Perbaikan: Tidak ada tanda titik koma (;) di akhir baris for ini
        for (int i = 0; i < original.length; i++) {
            fixedData[i] = original[i] + original[original.length - 1 - i];
        }
        
        System.out.println("4. Fixed Output: " + Arrays.toString(fixedData));
    }
}


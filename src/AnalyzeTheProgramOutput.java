public class AnalyzeTheProgramOutput {
    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        
        // 1 & 2. Output and the value of i during each iteration
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Iteration " + i + " -> Output: " + (numbers[i] + i));
        }
        
        // 3. Why use < instead of <= ?
        // Array indexes range from 0 to length-1 (0 to 3). 
        // Using <= would try to access index 4, which is out of bounds and causes an error.
    }

}

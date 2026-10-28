public class RemoveDuplicateData {

    public static void main(String[] args) {
        int[] ids = {101, 102, 101, 103, 102, 104, 105, 103};
        int[] unique = new int[ids.length];
        int count = 0;


        for (int id : ids) {
            boolean exists = false;
            for (int j = 0; j < count; j++) {
                if (id == unique[j]) { exists = true; break; }
             }
             if (exists) unique[count++] = id;
        }

        System.out.print("unique: ");
        for (int i = 0; i < count; i ++) System.out.println(unique[i] + " ");
        System.out.println("\nTotal: " + count);
    }
}
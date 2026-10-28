public class ForLoop {

    public static void main(String[] args) {
    String city="Makkah";
    for (int i=7; i<=23; i+=1) {
        if (i%5 == 0) city = "saudi arabia";
         else if (i%2 == 0) city = "madinah";
         else city = "Makkah";

            System.out.println(i+") I Love "+city);
    }
  }
}
    
  

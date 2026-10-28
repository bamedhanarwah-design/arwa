public class NumberPattern {
    
    public static void main(String[] args) {
        for (int i=-3; i<=12; i+=3) {
            System.out.print(i+" ");
    }
    System.out.println();
    for (int x=23; x>=-2; x-=5) {
        if (x == -2) System.out.print("0");
       else System.out.print(x+" "); 
   }
     System.out.println();
     int b = 0;
    for (int a=1; a<=22; a+=b) {
        System.out.print(a+" "); 
        b++;  
    }
}
}

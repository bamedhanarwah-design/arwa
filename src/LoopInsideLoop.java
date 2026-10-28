public class LoopInsideLoop {
    
    public static void main(String[] args) {
        for (int i=1; i<=3; i++) {
            for (int x=i; x<=5+i; x++) { 
                System.out.print(x+" ");          
    }
    System.out.println();
    }
  }
}
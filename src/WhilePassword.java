import java.util.Scanner;

public class WhilePassword {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean isRight = false;

        while (isRight == false) {
            System.out.print("\nWrite your password :");
            String password = sc.nextLine();
            if (password.length() > 15 && password.matches(".\\d.*")) {
                isRight = true;
            }else{
                System.out.print("password invalid. it need to contains number and more than 15 characters");
            }
         }
         System.out.print("welcome to the dasboard");
         sc.close();
    }
}   
        
    


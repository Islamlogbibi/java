
import java.util.Scanner;
public class TP_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();
        
        
        if (a >= 20){
            throw new ArithmeticException("welcome");
        }else{
            System.out.println("you can't enter");
        }
        
        
        
        
    }
}

import java.util.Scanner;

public class Homework{
    public static void main(String[] args) {
        int account = 1000;
        Scanner scan = new Scanner(System.in);
        while (true) { 
            System.out.println("\n\nyou have "+account+"$ to spent \nplease choose one of the options :\n1-add to my account \n2-remove from my account \n3-show my credit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("how much do you want to add : ");
                    int increase = scan.nextInt();
                    account += increase;
                    break;
                case 2 :
                    System.out.println("how much do you want to remove : ");
                    int decrease = scan.nextInt();
                    account -= decrease;
                    break;
                case 3 :
                    System.out.println("your current credit is : "+ account);
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
    }
}
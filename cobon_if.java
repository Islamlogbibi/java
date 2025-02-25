import java.util.Scanner;
public class cobon_if {
    public static void main(String[] args) {
        System.out.print("please enter the price : ");
        Scanner i = new Scanner(System.in);
        double price = i.nextInt();
        System.out.print("please enter the code : ");
        int code = i.nextInt();
        double new_price = 0;
        if (code == 1) {
            new_price = price * 0.25;
        } else if (code == 2) {
            new_price = price * 0.5;
        } else if (code == 3) {
            new_price = price * 0.75;
        }
        System.out.print("the new price is : ");
        System.out.println(price - new_price);
    }
}

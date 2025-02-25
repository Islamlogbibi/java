import java.util.Scanner;
public class cobon_switch {
    public static void main(String[] args) {
        System.out.print("please enter the price : ");
        Scanner i = new Scanner(System.in);
        double price = i.nextInt();
        System.out.print("please enter the code : ");
        int code = i.nextInt();
        double new_price = 0;
        switch (code) {
            case 1:
                new_price = price * 0.25;
                break;
            case 2:
                new_price = price * 0.5;

                break;
            case 3:
                new_price = price * 0.75;

                break;
            default:
                throw new AssertionError();
        }
        System.out.print("the new price is : ");
        System.out.println(price - new_price);
    }
}

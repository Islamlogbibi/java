import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        System.out.println("please enter the length : ");
        Scanner cl = new Scanner(System.in);
        int l = cl.nextInt();
        System.out.println("please enter the weadth : ");
        int b = cl.nextInt();
        int area = l * b;
        System.out.println("the area is : "+area);
    }
}
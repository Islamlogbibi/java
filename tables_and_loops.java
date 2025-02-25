import java.util.Scanner;
public class tables_and_loops {
    public static void main(String[] args) {
        System.out.println("please enter the values : ");
        Scanner i = new Scanner(System.in);
        int arr[] = new int[6];
        for (int n = 0; n < 6 ; n++){
            arr[n] = i.nextInt();
        }
        System.out.println("the values you entred are : ");
        for (int k = 0 ; k < arr.length ; k++) {
            System.out.println(arr[k]);
        }
    }
}
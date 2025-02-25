import java.util.Scanner;
public class sum_of_table {
    public static void main(String[] args) {
        System.out.println("please enter the number : ");
        int num[] = new int[10];
        Scanner i = new Scanner(System.in);
        for (int n = 1 ; n <= 9 ; n++) {
            num[n] = i.nextInt();
        }
        double sum = 0;
        for (int n = 0 ; n <= 9 ; n++) {
            sum += num[n];
        }
        double avg = sum/10;
        System.out.println("the sum is : "+sum);
        System.out.println("the average is : "+avg);
    }
}
import java.util.Scanner;

public class Exam_preparation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("please enter your age : ");
        age = scanner.nextInt();
        if (age < 0){
            System.out.println("please enter a valid age");
        }
        else if (age >= 18){
            System.out.println("you can vote");
        }
        else{
            System.out.println("you can't vote");
        }
        
    }
}
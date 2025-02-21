import java.util.Scanner;

public class test{
    public static void main(String[] args){
        System.out.println("Enter your year of birth : ");
        int birth_year;
        Scanner cl = new Scanner(System.in);
        birth_year = cl.nextInt();
        int age;
        age = 2025 - birth_year;
        System.out.println("Your age is : "+age);
    }
}
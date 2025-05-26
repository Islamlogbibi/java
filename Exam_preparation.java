
public class Exam_preparation{
    /*
    public static class Person{
        String name;
        String famillyname;
        void printfullname(){
            System.out.println("fullname : " + name + " " + famillyname);
        }
    }
    public static class Notes extends Person{
        int marq;
        void displaymarq(){
            System.out.println("fullname : " + marq);
        }
    }
    public static void main(String[] args){
        String s = """
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
        """;
        Notes person1 = new Notes();
        person1.name = "mabrouk";
        person1.famillyname = "logbibi";
        person1.marq = 18;
        person1.printfullname();
        person1.displaymarq();
    }
    */ 

   public class Cars{
    String name;
    String color;
    Driver drivername;
    Cars(String name, String color, Driver drivername){
        this.name = name;
        this.color = color;
        this.drivername = drivername;
    }
    void print(){
        System.out.println("we have a " + name + " car in the " + color + " color and with the driver " + drivername.drivername);
    }
   }
   public class Driver{
        String drivername;

        Driver(String drivername){
            this.drivername = drivername;
        }
    
   }

   public static void main(String[] args){
    
    Exam_preparation outer = new Exam_preparation();
    Driver driver1 = outer.new Driver("ahmed");
    Cars car1 = outer.new Cars("BMW", "black", driver1);

    car1.print();
   }
}
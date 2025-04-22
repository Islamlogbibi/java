public class TP_03 {

    
    public static class Person {
        String name;
        String familyName;
          public void displayFullname() {
            System.out.println("FullName: " + name  +" "+familyName);
        }
    }

    public static class Student extends Person {
        int moyen;
        public void displayMoyen() {
            System.out.println("Moyen: " + moyen);
        }
    }

   
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "mabrouk";
        
        student1.familyName = "logbibi";
        student1.moyen = 20;

        student1.displayFullname();
        student1.displayMoyen();
    }
}
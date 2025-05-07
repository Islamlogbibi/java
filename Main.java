public class Main{
    

    public class Voiture {
        String typedemotor;
        int vitesse;
        Camion capacité;

        Voiture(String typedemotor, int vitesse, Camion capacité) {
            this.typedemotor = typedemotor;
            this.vitesse = vitesse;
            this.capacité = capacité;
        }

        void print() {
            System.out.println("The type of motor is: " + typedemotor);
            System.out.println("The speed is: " + vitesse);
            System.out.println("The truck capacity is: " + capacité.capacité);
        }
        
    }
    public class Camion {
        int capacité;

        Camion(int capacité){
            this.capacité = capacité;
        }
        
    }
    
    public static void main(String[] args) {
        Main outer = new Main();
        Camion c = outer.new Camion(1000);
        Voiture v = outer.new Voiture("BMW", 220, c);
        v.print();
    }
}
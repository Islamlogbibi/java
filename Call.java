public class Call {

    public class Marque {
        String marque;

        Marque(String marque) {
            this.marque = marque;
        }
    }

    public class Telephone {
        double pixels;
        String name;
        Marque marque;

        Telephone(String name, double pixels, Marque marque) {
            this.name = name;
            this.pixels = pixels;
            this.marque = marque;
        }

        void print() {
            System.out.println("The pixels are: " + pixels);
            System.out.println("The name is: " + name);
            System.out.println("The marque is: " + marque.marque);
        }
    }

    public static void main(String[] args) {
        Call outer = new Call();
        Marque m = outer.new Marque("Samsung");
        Telephone t = outer.new Telephone("Galaxy S21", 108.0, m);
        t.print();
    }
}

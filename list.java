import java.util.ArrayList;
public class list{
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Toyota");
        
        cars.remove(3);
        System.out.println( cars.get(1));
        System.out.println( cars.size());
        
        System.out.println(cars);
    }
}
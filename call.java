public class call{
    public class telephone{
        double pixels = 12.5;
        String name = "iphone";
        marque m = new marque();
    }
    public class marque{
        String name = "apple";       
    }
    public static void main(String[] args) {
        telephone t = new call().new telephone();
        marque m = new call().new marque();
        System.out.println("the pixels are : "+t.pixels);
        System.out.println("the name is : "+t.name);
        System.out.println("the marque is : "+m.name);
    }

}

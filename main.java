public class main{
    public static void main(String[] args) {
        int ep = 5000;
        int re = 2000;
        String text = "pay";
        System.out.println("the pay is : "+text);
        ep += 100;
        re -= 50;
        System.out.println("the new ep is : "+ep);
        System.out.println("the new re is : "+re);
        double number_of_days_ep;
        number_of_days_ep = (5000 - re)/500;
        System.out.println("the number of days ep : "+ number_of_days_ep);
    }
}
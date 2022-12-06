import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static  LinkedList<Dishes>dises = new LinkedList<>();
    private static  LinkedList<Beverages>beverages = new LinkedList<>();
    private static  LinkedList<Salad> salads = new LinkedList<>();
    private static  LinkedList<Dessert>desserts = new LinkedList<>();

    private static final  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


       dises = new LinkedList<>(Arrays.asList(
               new Dishes("Plov",123,250,5.0),
        new Dishes("Manty",123,150,3.0),
       new Dishes("Samsa",123,200,1.0),
        new Dishes("Pizza",250,150,5.0)));




        beverages = new LinkedList<>(Arrays.asList(
                new Beverages("Pepsi",70,1,1.0),
                new Beverages("Coca-cola",768,665,65),
                new Beverages("Pepsi",768,665,65),
                new Beverages("Kymyz",768,665,65)));


       salads = new LinkedList<>(Arrays.asList(
               new Salad("Dollar",555,5,5),
               new Salad("Sezar",555,5,5)));


        desserts = new LinkedList<>(Arrays.asList(
                new Dessert("Kruasan",7866,68,7),
                new Dessert("Tort",7866,68,7),
                new Dessert("Cace",7866,68,6)));

        method();

    }

    public static void method(){
        while (true) {
            System.out.println("""
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     |   *******     Menu    ********        |
     |              1:Dishes                 |
     |              2:Beverages              |
     |              3:Salad                  |
     |              4:Dessert                |
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  """);
            commands();
}
    }
    public static void commands(){
        Dishes dishes = new Dishes();
        int number = scanner.nextInt();
        if (number == 1) {
            dishes.getall1(dises);
            System.out.println();
            dishes.create1(dises);
        } else if (number == 2) {
            dishes.getall2(beverages);
            Beverages beverages1 = new Beverages();
            beverages1.create2(beverages);
        } else if (number == 3) {
            Salad salad = new Salad();
            dishes.getall3(salads);
            salad.create3(salads);
        }else if(number == 4){
            Dessert dessert = new Dessert();
            dishes.getall4(desserts);
            dessert.create4(desserts);
        }else {
            System.out.println("Menuda mynday nerse jok");
        }
    }

}
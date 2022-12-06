import java.util.LinkedList;
import java.util.Scanner;

public class Dishes extends RestoranMenu{
    private static final  Scanner scanner = new Scanner(System.in);
    public Dishes(String name, int price, int weight, double cookingSpeed) {
        super(name, price, weight, cookingSpeed);
    }

    public Dishes(){

    }
    @Override
    void create1(LinkedList<Dishes> linkedList) {
        System.out.println("Choose dishes: ");
        String name = scanner.nextLine();
        for (Dishes dishes:linkedList) {
            if(name.equals(dishes.getName())){
                System.out.println(dishes);
                double summa = scanner.nextDouble();
                if(summa > dishes.getPrice()){
                    double result = summa - dishes.getPrice();
                    System.out.println("сдача: "+result);
                }
            }
        }
    }

    @Override
    void create2(LinkedList<Beverages> linkedList) {

    }

    @Override
    void create3(LinkedList<Salad> linkedList) {

    }

    @Override
    void create4(LinkedList<Dessert> linkedList) {

    }

    @Override
    void remove2(LinkedList<Dishes> linkedList) {

    }

    @Override
    void remove3(LinkedList<Beverages> linkedList) {

    }

    @Override
    void remove4(LinkedList<Salad> linkedList) {

    }

    @Override
    void remove1(LinkedList<Dessert> linkedList) {

    }

    @Override
    void getall1(LinkedList<Dishes> linkedList) {
        for (Dishes dishes: linkedList) {
            System.out.println(dishes);
        }

    }

    @Override
    void getall2(LinkedList<Beverages> linkedList) {
        for (Beverages beverages: linkedList) {
            System.out.println(beverages);
        }

    }

    @Override
    void getall3(LinkedList<Salad> linkedList) {
        for (Salad salad:linkedList) {
            System.out.println(salad);
        }

    }

    @Override
    void getall4(LinkedList<Dessert> linkedList) {
        for (Dessert desert:linkedList) {
            System.out.println(desert);

        }

    }

    @Override
    void sortByPrice() {

    }

    @Override
    void getByName() {

    }



}

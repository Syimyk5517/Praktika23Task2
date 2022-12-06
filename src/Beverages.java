import java.util.LinkedList;
import java.util.Scanner;

public class Beverages extends RestoranMenu{
    private static final Scanner scanner = new Scanner(System.in);
    public Beverages(String name, int price, int weight, double cookingSpeed) {
        super(name, price, weight, cookingSpeed);
    }
    public Beverages(){

    }

    @Override
    void create1(LinkedList<Dishes> linkedList) {

    }

    @Override
    void create2(LinkedList<Beverages> linkedList) {
        System.out.println("Choose beverages:");
        String name = scanner.nextLine();
        for (Beverages beverages:linkedList) {
            if(name.equals(beverages.getName())){
                System.out.println(beverages);
                double summa = scanner.nextInt();
                if(summa > beverages.getPrice()){
                    double result = summa - beverages.getPrice();
                    System.out.println("сдача: "+result);
                }else if(summa < beverages.getPrice()){
                    System.out.println("не хватает денег!");
                }
            }
        }
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

    }

    @Override
    void getall2(LinkedList<Beverages> linkedList) {

    }

    @Override
    void getall3(LinkedList<Salad> linkedList) {

    }

    @Override
    void getall4(LinkedList<Dessert> linkedList) {

    }

    @Override
    void sortByPrice() {

    }

    @Override
    void getByName() {

    }
}

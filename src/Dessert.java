import java.util.LinkedList;
import java.util.Scanner;

public class Dessert extends RestoranMenu{
    private Scanner scanner = new Scanner(System.in);
    public Dessert(String name, int price, int weight, double cookingSpeed) {
        super(name, price, weight, cookingSpeed);
    }

    public Dessert(){

    }
    @Override
    void create1(LinkedList<Dishes> linkedList) {

    }

    @Override
    void create2(LinkedList<Beverages> linkedList) {

    }

    @Override
    void create3(LinkedList<Salad> linkedList) {

    }

    @Override
    void create4(LinkedList<Dessert> linkedList) {
        System.out.println("Choose desert: ");
        String name = scanner.nextLine();
        for (Dessert dessert:linkedList) {
            if(name.equals(dessert.getName())){
                System.out.println(dessert);
                double summa = scanner.nextDouble();
                if(summa > dessert.getPrice()){
                    double result = summa - dessert.getPrice();
                    System.out.println("сдача: "+result);
                }
            }
        }

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

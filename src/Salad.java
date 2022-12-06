import java.util.LinkedList;
import java.util.Scanner;

public class Salad extends RestoranMenu  {
    private Scanner scanner = new Scanner(System.in);
    public Salad(String name, int price, int weight, double cookingSpeed) {
        super(name, price, weight, cookingSpeed);
    }

    public Salad(){

    }
    @Override
    void create1(LinkedList<Dishes> linkedList) {

    }

    @Override
    void create2(LinkedList<Beverages> linkedList) {

    }

    @Override
    void create3(LinkedList<Salad> linkedList) {
        System.out.println("Choose Salad: ");
        String name = scanner.nextLine();
        for (Salad salad:linkedList) {
            if(name.equals(salad.getName())){
                System.out.println(salad);
                double summa = scanner.nextDouble();
                if(summa > salad.getPrice()){
                    double result = summa - salad.getPrice();
                    System.out.println("сдача: "+result);
                }
            }
        }
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

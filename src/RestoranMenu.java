import java.util.LinkedList;

public abstract class RestoranMenu {
    private String name;
    private int price;
    private int weight;
    private double cookingSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getCookingSpeed() {
        return cookingSpeed;
    }

    public void setCookingSpeed(double cookingSpeed) {
        this.cookingSpeed = cookingSpeed;
    }

    public RestoranMenu(String name, int price, int weight, double cookingSpeed) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.cookingSpeed = cookingSpeed;

    }
    public RestoranMenu(){

    }

    @Override
    public String toString() {
        return
                "Name : " + name +
                "\nPrice : " + price + "som"+
                "\nWeight : " + weight +
                "\nCooking speed : " + cookingSpeed + "min";
    }

   abstract void create1(LinkedList<Dishes> linkedList);//создать
    abstract void create2(LinkedList<Beverages>linkedList);
    abstract void create3(LinkedList<Salad>linkedList);
    abstract void  create4(LinkedList<Dessert>linkedList);
    abstract void remove2(LinkedList<Dishes>linkedList);//создать
    abstract void remove3(LinkedList<Beverages>linkedList);
    abstract void remove4(LinkedList<Salad>linkedList);
    abstract void  remove1(LinkedList<Dessert>linkedList);
    //   удалять
    abstract void getall1(LinkedList<Dishes>linkedList);//создать
    abstract  void getall2(LinkedList<Beverages>linkedList);
    abstract void getall3(LinkedList<Salad>linkedList);
    abstract  void  getall4(LinkedList<Dessert>linkedList);
    //    получить все
    abstract void sortByPrice(); //
    abstract void getByName();     //      получить по имени
}

package OOP2;

import java.util.ArrayList;
import java.util.List;

public class GenericAndInheritance8 {
    public static void main(String[] args) {
//        Bag<Apple> bag = new Bag<>();
//            bag.addFruit(new Apple());
//        bag.printPurchase();


        // передача копеек типом Long
        List<Long> longList = new ArrayList<>();
        longList.add(Long.MAX_VALUE);

        new Printer2<>(longList).print();

        // передача копеек типом Integer
        List<Integer> intList = new ArrayList<>();
        intList.add(10000);

        new Printer2<>(intList).print();

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");

        // вызывает ошибку компиляции
//        new Printer<>(stringList).print();

    }
}

abstract class Fruit{
    private final String name;
    private final double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Apple extends Fruit{
    public Apple(){
        super("Apple", 10);
    }
}

class Banana extends Fruit{
    public Banana(){
        super("Banana", 15.50);
    }
}

class Bag <T extends Fruit> {
    private final List<T> purchase = new ArrayList<>();

    public void addFruit(T fruit){
        purchase.add(fruit);
    }

    public void printPurchase() {
        if (!purchase.isEmpty()){
            double sum = 0;
            for (T fruit : purchase){
                sum += fruit.getPrice();
            }
        }
    }
}

class Printer2 <T extends Number> {
    private final List<T> list;

    // Конструктор принимает список
    public Printer2(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    public void print(){
        for (T value : list) {
            // Преобразуем копейки в рубли
            double rubles = value.doubleValue() / 100;
            System.out.println(rubles + " руб.");
        }
    }

}



//любой тип Т, который наследуется от класса Number. Всегда будет только числом (Integer или Double)
class BoundedBox<T extends Number>{
    public T number; //переменная number всегда будет иметь тип одного из наследников

    public BoundedBox(T number) {
        this.number = number;
    }

    BoundedBox<Integer> i = new BoundedBox<>(10);
    BoundedBox<Double> d = new BoundedBox<>(5.4);
//    BoundedBox<String> = new BoundedBox("Hello"); // ошибка компляции
}
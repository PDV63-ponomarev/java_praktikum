package collections2.comparator6;

/*

Интерфейс Comparator и сортировка коллекций

Списки - это коллекции, которые поддерживают операцию сортировки,
то есть элементы в них можно расположить в определенном порядке. Задавать правила
сортировки произвольных классов позволяет интерфейс Comparator<T> (Сравнивать)

Сложность сортировки объектов состоит в том, что заранее не известен порядок,
в котором их надо расположить.

Интерфейс Comparator<T> помогает организовать сортировку объектов. Для этого есть ряд методов.
Главный из них - метод для сравнения двух объектов int compare(T, T).
При наследовании интерфейса его нужно переопределить. Этот метод принимает 2 экземпляра одного типа
и возвращает целое число.
- Если результат меньше нуля, первый объект меньше второго
- Если равен нулю, то объекты равны
- если больше нуля, первый объект больше второго
В зависимости от результата определяется порядок между двумя объектами.


Пусть в программе интернет-магазина товар задается классом Item.
 У него есть поля: название, цена и рейтинг популярности

Организуем несколько вариантов сортировки - по названию, по стоимости и по популярности.
Для каждого варианта потребуется написать компаратор - спец класс, который будет наследовать
интерфейс Comparator<T> и переопеределять метод int compare(T, T)
Компратор сравнивающий цены назовем ItemPriceComparator. При наследование Comparator<T> требует
указать на месте параметра T касс Item. Внутри переопределим метод compare(Item, Item).
Нужно чтобы дешевый товар отображался впереди дорогого. Для этого будем сравнивать цены между собой
и возвращать 1, если цена выше. -1 если цена ниже и 0 если равны.

Для применения сортировки списка товаров создаем в главном классе объект-компаратор
и затем передаем его в качестве параметра в метод сортировки
void <имя_cписка>.sort(Comparator<? super T> c) интерфейса List<T>


Для некоторых стандартных типов есть готовые решения для сортировки.
Для лексикографической сортировки слов без учетка регистра, можно использовать
статическую переменную CASE_INSENSITIVE_ORDER классы String, которая хранит
в себе Comparator<String>, сортирующий строки без учета регистра.


Классы-обёртки такие как Integer и Double не реализуют компараторы, но содержат статические методы
compare(...), которые можно использовать. Если исп метод Integer.compare(Integer, Integer)
код

@Overrode
public int compare(Item item1, Item item2){
    return Ingere.compare(item1.price, item2.price2)
    }


Метод reverser()
Его задача отсортировать в обратном порядке. Основной компаратор сортирует по убиванию,
 то этот по возврастанию. Это упрощает реализацию двусторонних сортировок - достаточно
 реализовать сортировку только в одном направлении, противоположную можно получить через вызов
 reversed().
 ItemPriceComparator itemPriceComparator = ItemPriceComparator.reversed();
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparator6 {

    public static void main(String[] args) {
        //создаем список товаров
        List<Item> items = new ArrayList<>();
        items.add(new Item("Рубашка", 4500, 37));
        items.add(new Item("Носки", 66, 8));
        items.add(new Item("Толстовка", 1399, 74));
        items.add(new Item("Трусы", 166, 19));

        System.out.println("До сортировки:");
        System.out.println(items);

        //Создаем объект-компаратор по цене
        ItemPriceComparator itemPriceComparator = new ItemPriceComparator();

        //применяме компаратор
        items.sort(itemPriceComparator);

        System.out.println("После сортировки");
        System.out.println(items);

        // создаем и применяем объект-компаратор лексикографической сортировки
        ItemStringInSensitiveNameComparator comparator = new ItemStringInSensitiveNameComparator();
        items.sort(comparator);
        System.out.println("После сортировки");
        System.out.println(items);

        Comparator<Item> ReversedItemPriceComparator = itemPriceComparator.reversed();
        items.sort(ReversedItemPriceComparator);
        System.out.println("После обратной сортировки");
        System.out.println(items);

        // Сортировка списка фруктов в лексикографическом порядке
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Киви");
        fruits.add("Ананас");
        System.out.println(fruits);
        // Вызов и сортировка
        fruits.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(fruits);

    }

    static class Item {
        public final String name;
        public final int price;
        public final int popularity;

        public Item(String name, int price, int popularity) {
            this.name = name;
            this.price = price;
            this.popularity = popularity;
        }

        // переопределение для вывода содержания списка
        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", popularity=" + popularity +
                    '}';
        }
    }

    static class ItemStringInSensitiveNameComparator implements Comparator<Item> {
        @Override
        public int compare(Item item1, Item item2) {
            return String.CASE_INSENSITIVE_ORDER.compare(item1.name, item2.name);
        }
    }

    static class ItemPriceComparator implements Comparator<Item> { //на месте Т класс Item
//        @Override
//        public int compare(Item item1, Item item2) {
//            //сравниваем товар. Более дорогой должен быть дальше в списке
//            if (item1.price > item2.price){
//                return 1;
//                // более дешевый - ближе к началу списка
//            } else if (item1.price < item2.price){
//                return -1;
//                // если стоимость равна, возвр 0
//            }else {
//                return 0;
//            }
//        }

        // упрощение. Само число не важно, главное знак. Если положительное, отрицательное или ноль
        @Override
        public int compare(Item item1, Item item2) {
            return item1.price - item2.price;
            /*
            Если положительный результат ->  первый товар дороже
            Если ноль -> цены равны
            Если отрицательный результат -> первый товар дешевле второго
             */
        }
    }
}



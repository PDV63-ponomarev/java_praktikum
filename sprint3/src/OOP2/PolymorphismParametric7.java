package OOP2;

/*
Параметрический полиморфизм
позволяет реализовать поведение класса или метода с указанием параметров
и возвращаемых значений общего вида вместо конкретных.
Исп когда классу все равно, данные какого типа он использует.

Дженерики, или параметризованные типы, являются реализацией параметрического полиморфизма
позволяет писать классы и алгоритмы, поведение которых не зависит от конкретного типа.
Можно указать какие типы будут использоваться определённым классом, а Java будет проверять
при компиляции программы, чтобы небыло ошибки и передавалось верное значение.

Объявление класса с дженериком
после имени класса в <> указывается имя параметра типа.
Тип может быть только ссылычным, примитивы не работают
Сам класс называется обобщенным, или типизированным
(Часто исп имена Е и Т)

 */


import java.util.HashMap;
import java.util.Map;

public class PolymorphismParametric7 {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(4, "десять");
        System.out.println("Координаты на карте");
        pair.print();
        Integer x = pair.getKey();
        String y = pair.getValue();


        Map<String, Double> catsWithWeight = new HashMap<>();
        catsWithWeight.put("Пиксель", 4.3);
        catsWithWeight.put("Космо", 4.0);
        catsWithWeight.put("Бубл", 3.2);
        catsWithWeight.put("Вупсень", 2.3);

        for (String cat : catsWithWeight.keySet()){
            System.out.printf("Котик %s весит %f", cat, catsWithWeight.get(cat));
            System.out.println();
        }

//        System.out.println();
//
//        Pair<Integer, String> stringPair = new Pair<>("username", "java");
//        System.out.println("Переданный текст");
//        stringPair.print();
//        String user = stringPair.getKey();
//        String cheatCode = stringPair.getValue();
    }

//    GeneralClass<String> stringObject = new GeneralClass<String>();
//    stringObject.element = "Hello";
//
//    GeneralClass<Integer> intObject = new GeneralClass<Integer>();
//    intObject.element = "Hello";

}

interface PrinterI<T>{
    public void print(T value);
}

//типизированный класс наследник типизированного интерфейса
class GeneralPrinter<Type>  implements PrinterI<Type>{
    @Override
    public void print(Type value) {
        System.out.printf("(%s имеет тип %s)", value, value.getClass());
    }
}

// нетепизированный класс исп типизированный интерфейс. Нужно указать конкретный тип интерфейса
class IntegerPrinter implements PrinterI<Integer>{
    @Override
    public void print(Integer value) {
        System.out.printf("(%d имеет тип Integer)", value);
    }
}



class Pair<K, V>{
    public final K key;
    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void print(){
        System.out.printf("(%s, %s)", key, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class GeneralClass<T>{
    T element; //тип поля element будет таким, как укажем при создании обьекта
}
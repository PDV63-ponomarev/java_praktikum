package collections2;


/*

Интеррфейс List<T> - прямой наследник интерфейса Collection<T>

Методы List<T>
Дает возможности контролировать процесс добавления нового элемента в список,
организовать поиск и вносить изменния.
Для этого предлоставляет следующие методы:
1. Методы добавления нового элементы на определенное место в списке
    - в конец списка - add(E e)
    - в любое место - add(int index, E e),
     где int index - индекс позиции на которую нужно добавить элемент.
     остальные элементы сдвигаются на одну позицию вправо
2. Методы для поиска элементов в списке и доступа к ним:
    - для получения элемента по индексу - get(int index)
    - для замены элемента по индексу - set(int index, E e)
    Можно менять только существующий элемент
    - для удаления элемента по индексу remove(int index)
    - для удаления по значению remove(E e). Если есть несколько одинаковых элементов
    то метод удаляет первый найденным (с наименьшим индексом)


Интерфейс List<T> предоставляет два способа для преобразования массива
 или набора случайных элементов в список
- Метод Arrays.asList(...)
 С его помощью можно создать и заполнить небольшой список одним выражением
- Метод List.of(..)
Добавлен в Java11, аналогичный процесс. Вызывается статический метод, передаются элементы,
результат сохраняем в переменную-список

Оба метода считаются неизменяемыми.
 Они не поддерживают операции удаления или добавления элементов
При работе со списком Arrays.asList() можно заменить элемент при помощи set(int, T)
но для списка List.of() будет ошибка


 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
//        ListPrimer();
//        AsList();
//        ListOf();
//        ListPractic();
        AsListPractic();
    }

    public static void ListPrimer(){
        List<Long> list = new ArrayList<>(); //создание списка

        // добавление элементов в конец
        list.add(0L);
        list.add(1L);
        list.add(2L);
        System.out.println(list);

        // 2L сдвигается вправо
        list.add(2, 22L);
        System.out.println(list);

        // вставка элемента в конец списка
        list.add(4, 4L);
        System.out.println(list);

        //удаления элемента
        list.remove(4); // по индексу
        list.remove(2L); //по значению
        System.out.println(list);

        System.out.println(list.get(2)); //получение и вывод элемента по индексу

        list.set(1, 11L); // изменение элемента
        System.out.println(list);
    }

    public static void AsList(){
        String[] citiesArray = {"Воронеж", "Сахалин", "Самара"};
        List<String>cities = Arrays.asList(citiesArray);

        List<String>cities2 = Arrays.asList("Москва", "Питер", "Воркута");

        System.out.println(cities);
        System.out.println(cities2);
    }

    public static void ListOf(){
        String[] citiesArray = {"Воронеж", "Сахалин", "Самара"};
        List<String>cities = List.of(citiesArray);

        List<String>cities2 = List.of("Москва", "Питер", "Воркута");
        System.out.println(cities);
        System.out.println(cities2);
    }

    public static void ListPractic(){
        final String[] coffeeArray = {"Латте", "Капучино", "Американо"};

        for (String c : coffeeArray){
            System.out.println(c + ", ");
        }
        System.out.println();

        final List<String> coffeeList = List.of(coffeeArray);
        System.out.println(coffeeList);

        //преобразование списка в массив
//        String[] in = new String[]{};
        String[]coffeeArrayNew = coffeeList.toArray(new String[]{});

        for (String coffee : coffeeArrayNew){
            System.out.println(coffee + ", ");
        }
    }

    public static void AsListPractic(){

        List<String> cities = Arrays.asList("Воронеж", "Сахалин", "Иркутск");

        //создаем массив равный размеру списка cities
        String[] citiesArray = new String[3];

        //результат метода записываем одновременно в otherCities и citiesArray
        String[] otherCities = cities.toArray(citiesArray);

        for (String city : citiesArray){
            System.out.println(city + ", ");
        }

        System.out.println("~~~~~~~~~~~");

        for (String city : otherCities){
            System.out.println(city + ", ");
        }

    }


}

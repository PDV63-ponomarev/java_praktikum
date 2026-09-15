package hash3;

/*

LinkedHashMap
LinkedHashMap упорядочивает данные хеш-таблице двумя способами:
- в порядке добавления значений - при итерации первой будет та запись, которая была добавлена
в таблицу первой, последняя - последней.
- В порядке доступа к записям - при итерации первой будет та запись, к которой больше всего обращений,
а последней - та к которой была последнее обращение. Обращением считается вызов одного из методов для
выборки данных по ключу get или getOrDefault

Задать нужный вариант можно в момент создания новой хеш-таблицы.

**
Конструкторы LinkedHashMap

public LinkedHashMap()
создает новую хеш-таблицу со стандартными настройками:
- 16 пустых ячеек
- коэффициент заполнения 75%
- ключи отсортированы в порядке их добавления

publick LinkedHashMap(Map<? extends K, ? extends V> m)
создает новую хеш-таблицу со стандартными настройками и заполняет ее данными
из переданной в параметр m хещ-таблицы. Создает копию переданной хещ-таблицы любого типа

publick LinkedHashMap(int initialCapacity)
создает новый объект со стандартными настройками. В таблице будет столько ячеек, сколько указано
в папамеипе initialCapacity

publick LinkedHashMap(int initialCapacity, float loadFactor)
дополнительно к кол-ву ячеек, указывает и коэфициаент заполнения

publick LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
Этот конструктор позволяет указать, какой тип сортировки ключей будет использоваться.
Если в параметре accessOrder будет true, то итерация проводится в порядке доступа к записям
есди false - в порядке добавления записей (по умолчанию)


*****
Реализации TreeMap
TreeMap используется когда нужно, чтобы порядок ключей в таблице был определенным и специфичным
Его ещё нызвают естественным порядком. Например по алфавиту или возростанию числе.

Конструкторы TreeMap:

public TreeMap()
создает новую пустую хещ-таблицу TreeMap. Внутри пустые ячейки в момент
 создание нового объекта не появляются

public TreeMap(Comparator<? super K> comparator)
Определяет порядок сортировки в момент создания объекта. Для этого в конструктор
передается объект типа Comparator. В нем должны быть описаны правила, по которым в хещ-таблице
будет сортировка ключей

public TreeMap(Ma[<? extends K, ? extends V> m)
создает новый обьект TreeMap и заполняет данными из переданной хещ-таблицы

public TreeMap(SorteMap<K, ? extends V> m)
Создает новый объект TreeMap со стандартными настройками и заполняет данными из переданой таблицы
при этом можно передать только хеш-таблицу типа SortedMap (т.е. уже отсортированными данными)


Порядок сортировки можно двумя способами:

1) при создании обхекта TreeMap передать желаемый порядок в конструктор
Например при создании хещ-таблицы users мы передали в конструктор TreeMap обхект userComparator.
Тип этого объекта Comparator, и в методе compare написана логика сортировки данных в хеш-таблице.
В пример по порядку возрастания ID

    Comparator<User> userComparator = new Comparator<>(){
        @Override
        public int compare(User user1, User user2){
            return user1.userID - user2.userID;
        }
    };
    Map<User, String> users = new TreeMap<>(userComparator);

2) Реализовать интерфейс Comparable у класса, который будет использоваться как ключ. В этом
примере ключами являются объекты класса User. Пользователи будут автоматическо отсортированы
по возрастанию их ID

    class User implements Comparable<User>{
        public Integer userId;
        publick String userName;

        @Overrode
        public int compareTo(User o){
            return this.userId - o.userId;
        }
    };

Первый вариант обычно применяется, когда в классе, который используется как ключ, нельзя отредектировать
код и реализовать интерфейс Comparable. Или когда в разных местах программы нужна разная логика
сортировки, для эторго придется создавать несколько разных объектов Comparable

Второй способ удобен в тех случаях, когда есть только один способ сортировки данных, и он используется во
всех местах программы.


Метод firstEntry() возвращает самую первую по порядку запись (ключ и значение), получить
только ключ можно через метод firstKey(). После метода данные сохраняются

lastEntry() и lastKey() позволяет получить последние по порядку данные

pollFirstEntry() и pollLastEntry() возвращают последнию и первую запись, но удаляют её из таблицы


*****
Создание своей хеш-таблицы
При решение обычных задач редко возникает необходимость в собственной хещ-таблицы.
Универсальные реализации из стандартной библиотеки Java достаточно

Создать свою хеш-таблицу можно двумя способами:
-Создать новый класс, который будет реализовывать интерфейс Map. В этом случае нужно
самостоятельно придумать алгоритм, а затем написать реализацию каждого метода из интерфейся Map.
Вариант сложный, требует глубокого знания алгоритмов
-Создать новый класс, который будет наследовать от одного из готовых реализаций хеш0таблицы.
Переопределить только те методы которые нужны.

Пример собственной реализации хещ-таблицы PracticumMap и наследует от HashMap.
Переопределим мето put():
1. Выводит на консоль тот ключ и значение, которые сейчас записываются
2. вызывает оригинальный метод put() у родительского класса HashMap который отвечает
за сохранение данных в хещ-таблицу.

Для переменной numbers используется стандартная реализация HashMap.
Для переменной numbers2 реализация PracticumMap.



 */


import java.util.*;

public class LinkedAndTreeMap {

    public static void main(String[] args) {
//        users();
//        standrt();
        Practicum();


    }

    public static void standrt(){
        //создание по умолчанию
        Map<String, String> films = new LinkedHashMap<>();
        films.put("Transformers", "Kalambus");
        films.put("Harry Potter", "Kemeron");
        films.put("Hackers", "Softy");
        films.put("Titanic", "Kemeron");

        for (String film : films.keySet()){
            System.out.println(film);
        }
    }


    private static void users(){
        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Map<User, String> users = new TreeMap<>(userComparator);
        fillWithData(users);

        System.out.println("Пользователи: ");
        for (Map.Entry<User, String> entry : users.entrySet()){
            System.out.println(entry);
        }
    }

    private static void fillWithData(Map<User, String> users){
        users.put(new User(545, "Nikolay"), "Russia");
        users.put(new User(8937, "Thomas"), "Portugal");
        users.put(new User(45, "Iv"), "France");
        users.put(new User(5778, "Lyly"), "Italy");
        users.put(new User(247, "Ving"), "China");
    }

    static class User{
        Integer id;
        String name;

        public User(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    static void Practicum(){
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 10);
        numbers.put(2, 20);

        Map<Integer, Integer> numbers2 = new PracticumMap<>();
        numbers2.put(3, 30);
        numbers2.put(4, 40);
    }

    static class PracticumMap<K,V> extends HashMap<K,V>{
        @Override
        public V put(K key, V value){
            System.out.println("Сохранение значение " + value + " в ключе " + key);
            return super.put(key,value);
        }
    }

}


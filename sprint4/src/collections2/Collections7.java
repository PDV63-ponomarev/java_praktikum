package collections2;

/*
В коллеции Java входят ряд утилитарных (полезных) классов для упрощения работы с другими классами
Один из таких - класс-помощник Collections

Быстрысе списки
Методы позволяющие быстро создавать неизвеняемые списки нужного размера
- Collections.emptyList() создает пустой список
- Collections.singletonList(T) создает список из единственного элемента
- Collections.nCopies(int, T) создает список, где T повторен n раз

Создавать и сразу использовать такие списки нужно, например, для передачи данных в метод или конструкторы классов.
Добавить новые элементы в них нельзя. Неизменность нужна чтобы список случано небыл изменен.
Чем более ограниченные структуры данных используются, тем меньше шанс возникновения багов.

Неизменяемый список всгеда можно превратить в изменяемый ArrayList.
 Это может понадобится, если элементы нужно отсортировать.
Сортировка как правило включает перемещение элементов из одного конца списка в другой, а неищменяемые структуры данных
запрещают менять порядок элементов.
Чтобы создать изменяемый список, нужно передать назменяемый список (Созданный при помощи List.of(...) или Collections)
в конструктор ArrayList
 final List<String> immutableList = List.of("Еж", "Лиса", "Волк"); - immutableList неизменяемый список
 final ArrayList<String> mutableList = new ArrayList<>(immutableList); - mutableList изменяемый


Замена всех элементов списка
Метод Collections.fill(List<T>, T) позволяет присвоить всем элементам списка List<T> единое значение Т.
Одно из частых применений - подготовка данных для тестов в программе.


Копирование элементов одного списка в другой
Collections.copy(List<T>, List<T>)
Список из которого копируются элементы указывается вторым.
Список, куда происходит копирование, должен быть не меньше списка из которого копируются элементы. Иначе ошибка.
Этот метод тредует гораздо меньше ресурсов, чем пересоздание списка, если списки большие.


Сортировка
Collections.sort(List<T>, Comparator<T>)
Происходит так же как и при методе .sort(Comparator<T>) в List<T>
Методы Collections.sort(List<T>, Comparator<T>) и List.sort(Comparator<T>) ведут себя одинаково


Поиск минимума и максимума
Collections.min(Collection<T>) - найти минимум
Collections.max(Collection<T>) - найти максимум
Чтобы сработали корректно, необходимо, чтобы тип T реализовал интерфейс Comparable<T> (не путать с Compatator<T>)
Задача Comparable<T> - задать естественную сортировку для класса объектов.
Он предоставляет единственный метод int copmareTo(T),
который ведет себя аналогично методу compare(T, T) из Comparator<T>
Если copmareTo возвращает число меньше нуля - такущий элемент (доступен через this) меньше второго,
если ноль - равны, если больше - то больше.
Наследовать Comparable<T> в отличие от Compatator<T> можно только один раз

Comparable<T> подходит когда у класса может быть только единственный верный способ сортиовки. Например, такой
есть у целых чисел - от меньшего к большему. Поэтому класс Integer реализуют Compatable<Integer>.
С объектами сложнее - товары в магазине нужно сортировать по цене или по популярности.
Реализовать Comparable<T> имеет смысл только для достаточно простых классов, для всех остальных лучше создать
отдельный класс, реализуюзий интерфейс Comparator<T>.

Comparator<T> можно использовать для поиска минимума и максимума при помози методов:
Collections.min(Collection, Comparator<T>) - найти минимум
Collections.max(Collection, Comparator<T>) - найти максимум
Оба принимаю экземпляры Comparator<T> в качестве второго аргумента

~~~

Как правило такие классы как Collections, создаются чтобы объекдинить в одном классе набор статических метдов
или констант, которые нужны сразу в большом количестве мест в программе. Если классы необязательно должны быть
в стандартной библиотке, к примеру для организации работы с файлами и определения формата вывода данных на экранах.

Еще утилитарные классы часто выносят некую "Общную" функциональность. К примему Collections.min(Collection) мог бы
находиться и в интерфейсе Collection, но тогда всем бы его наследникам надо было его реализовать. В этом нет смысла,
поскольку поиск минимума (или максимума( выполняется идентичным образом для абсолютно любой коллекции.

Важно запомнить, что любой утилитарный класс обладает двумя важными характеристиками:
-Нет публичных конструкторов. В них нет смысла, поскольку все методы утилитарного класса статические либо приватные,
тоесть доступны без создания экземпляра класса. Это же справедливо для констант - они все статические и неизменяемые.
- Нет изменяемых внутренних полей (за редким исключением). Утилитарный класс может использоваться
 в любом месте программы, поэтому его методы должны работать всегда вне зависимости от состояний внутренних полей.
 Лучший вариант когда таких полей нет совсем.


 */



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections7 {

    public static void main(String[] args) {
//        Lists();
//        Fill();
//        Copies();
        Sort();


    }

    public static void Lists() {
        final List<String> emptyList = Collections.emptyList();
        final List<String> singletonList = Collections.singletonList("Hello world");
        final List<String> nCopiesList = Collections.nCopies(5, "Java");

        System.out.println(emptyList);
        System.out.println(singletonList);
        System.out.println(nCopiesList);
    }

    public static void Fill() {
        List<Integer> listOfInt = new ArrayList<>();
        listOfInt.add(14);
        listOfInt.add(10);
        listOfInt.add(200);

        System.out.println(listOfInt);

        Collections.fill(listOfInt, 13);
        System.out.println(listOfInt);
    }

    public static void Copies() {
        List<Integer> listOfIntOne = new ArrayList<>();
        listOfIntOne.add(11);
        listOfIntOne.add(12);
        listOfIntOne.add(13);

        List<Integer> listOfIntTwo = new ArrayList<>();
        listOfIntTwo.add(21);
        listOfIntTwo.add(22);
        listOfIntTwo.add(23);

        System.out.println(listOfIntOne);
        System.out.println(listOfIntTwo);

        Collections.copy(listOfIntOne, listOfIntTwo);

        System.out.println(listOfIntOne);
        System.out.println(listOfIntTwo);
    }


    public static void Sort() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Potato");
        fruits.add("Nuts");

        System.out.println(fruits);

        Collections.sort(fruits, String.CASE_INSENSITIVE_ORDER);

        System.out.println(fruits);

    }


    public class Student implements Comparable<Student> {
        private final String name;
        public final int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student o) {
            final int nameComparison = String.CASE_INSENSITIVE_ORDER.compare(this.name, o.name);
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                return Integer.compare(this.age, o.age);
            }
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
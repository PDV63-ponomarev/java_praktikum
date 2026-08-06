package object_class;

//все классы по умолчанию имеют обший предок Object
//наследование происходит по умолчанию , extends не требуется

//переменно типа object можно присвоить любое ссылочное значение
//это может быть объектом любого класса, список, массив, авто

//        Object anyObject; //переменная типа Object может принимать любое значение

//        anyObject = new Person("Vadim"); // обьект класса

//       массив обьектов
//        Peson[] people = {new Person("Evgeni"), new Peson("Petr")};
//        anyObject = people;

//       массив со значениями примитивного типа
//        anyObject = new int[]{1,2,3,4};

//        anyObject = 41; //автоупаковка в Integre
//        anyObject = true; //автоупаковка Boolean
//        anyObject = "Это строка"; // Обьект классы String


public class Spr2_3_1 {
    public static void main(String[] args) {
        Person[] people = {new Person("Pelagiy"), new Person("Vania")};
        int peopleCount = sizeOf(people);
        System.out.println("В массиве people " + peopleCount + " элементов");

        String[] name = {"Fedot", "Sidot", "Gekot"};
        int namesCount = sizeOf(name);
        System.out.println("В массиве names " + namesCount + " элементов");

        Integer[] numbers = {41, 24, 42, 22, 435, 54, 32};
        int numbersCount = sizeOf(numbers);
        System.out.println("В массиве numbers " + numbersCount + " элементов");

    }
    //подсчет количества элементов в массиве
    // параметр Object[] array делает метод универсальным
    public static int sizeOf(Object[] array){
        int count = 0;
        for (Object o: array){
            count++;
        }
        return count;
    }
}


class Person{
    private final String name;
    public Person(String name){
        this.name=name;
    }
}

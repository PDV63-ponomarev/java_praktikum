package object_class;


//Хеширование (hashCode()) способ для упрошения поиска среди классов
//hashCode переопределяется на моменте создания классов обьекта

//правила hashCode:
//1) Если при сравнение equals(Object) обьекты равны,
//то hashCode() должен возврашать у каждого одно и тоже число
//2) Метод hashCode() должен возврашать одно и тоже целое число,
//пока значения полей не изменятся
//3) Нужно учитывать что обьекты не равные в equals(Object) были разные хеш-коды,
//но они могут совпадать. Если у двух обьектов одинаковый хеш-коды, то не факт что они равны.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Spr2_3_3 {

    public static void main(String[] args) {
        ArrayList<PersonHash> persons = new ArrayList<>(); //список имен и фамилий
        HashMap<PersonHash, String> contacts = new HashMap<>(); //хеш-таблица контактов

        String firstName = "Stiven";
        String lastName = "Universal";
        String phoneNumrer = "8(800)555-35-35";

        persons.add(new PersonHash(firstName, lastName)); // добавляем элемент в список

        contacts.put(new PersonHash(firstName, lastName), phoneNumrer); //добавляем элемент в таблицу

        System.out.println("Количество людей в списке: " + persons.size() +
                ", контактов: " + contacts.size()); //проверяем наличие элементов

    }
}

class PersonHash{
    public String firstName;
    public String lastName;

    public PersonHash(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonHash person = (PersonHash) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        int hash = 17; //простое число
        if (firstName != null){
            //вычисляем хеш первого поля и добавляем к нему начальное занчение
            hash = hash + firstName.hashCode();
        }
        hash = hash * 31; //умножаем промежуточный результат на простое число
        if (lastName != null){
            //вычисляем хеш первого поля и добавляем к нему начальное занчение
            hash = hash + lastName.hashCode();
        }
        return hash;
    }
}
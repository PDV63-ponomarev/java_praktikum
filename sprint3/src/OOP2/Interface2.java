package OOP2;

/*

Интерфейсы нужны для взаимодействия с множеством наследования.
В программировании интерфейс - это совокупность методов без реализации,
которые описывают некоторый функционал.

На основе интерфейса нельзя создавать объект, у него нет конструктора по умолчанию
и в него нельзя добавить конструкторы с параметрами


Абстрактные классы нужны чтобы у всех насследникова создавать и поддерживать общую структуру
Интерфейсы нужны для добавления в класс-реализацию определенной функциональности

Класс обяхательно должен реализовать все методы интерфейса, либо объявить себя абстрактным

В интерфейсе можно обьявить переменные, но они всегда константы
В переменных интерфейса часто сохраняют значения, которые нужно использовать в программе

один класс может реализовать сразу несколько интерфейсов


 */

import java.util.ArrayList;
import java.util.List;

//обьявлеие интерфейса
public interface Interface2 {
    //сигнатура метода добавления заметки
    void addNote(String note);
}

class CaledarApp implements Interface2{
    List<String> notes = new ArrayList<>();

    @Override
    public void addNote(String note){
        notes.add(note);
        System.out.println("Заметка добавлена");
    }
}


interface Flyable{
    void fly();
    void land();
}

interface Waterfowl{
    void swim();
}

interface Hunter{
    void hunt();
}

class Seagull implements Flyable, Waterfowl, Hunter {

    public void fly() {
        System.out.println("Парит над морем");
    }

    public void land() {
        System.out.println("Мягкая посадка");
    }

    public void hunt() {
        System.out.println("Ловлю рыбу");
    }

    public void swim() {
        System.out.println("Качаюсь на волнах");
    }
}
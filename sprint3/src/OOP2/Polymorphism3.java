package OOP2;

/*

Полиморфизм - способ принимать разные формы
Это способность программы одинаково работать с объектами, если они имеют одинаковый интерфейс
при этом код может ничего не знать о конкретном типе этого объекта

 */



public class Polymorphism3 {
}


//Этот интерфейс могут использовать разные классы, не связанные между собой
interface MailClient{
    void send(String from, String to, String text);
    void recieve();
}

class Dove implements MailClient{
    @Override
    public void send(String from, String to, String text) {
        System.out.println("Голубь прилетел к " + from + " от " + to + " с письмом: " + text);
    }

    @Override
    public void recieve() {
        System.out.println("Голубь вернулся с ответом");
    }
}

class Drone implements MailClient{
    @Override
    public void send(String from, String to, String text) {
        System.out.println("Дрон прилетел к " + from + " от " + to + " с письмом: " + text);
    }

    @Override
    public void recieve() {
        System.out.println("Дрон вернулся с ответом");
    }
}
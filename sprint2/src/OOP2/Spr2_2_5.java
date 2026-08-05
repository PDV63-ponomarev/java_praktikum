package OOP2;

// наследование классов

public class Spr2_2_5 {
    public static void main(String[] args) {
       Fox foxAlica = new Fox();
        System.out.println("Это лиса Алиса");
        System.out.println("Цвет - " + foxAlica.color);
        System.out.println("Вес - " + foxAlica.weight + "кг.");
        System.out.println("Она дикая - " + foxAlica.isWild);
        System.out.println("Она хищник - " + foxAlica.isPredator);
        System.out.println("Она умеет говорить - " + foxAlica.say());
        System.out.println("И может рычать - " + foxAlica.growl());
    }

}

class Animal {
    protected double weight;
    protected int age;
    protected int heartRate;
    protected boolean isWild;

    public Animal(){
        weight = 0;
        age = 0;
        heartRate = 100;
        isWild = true;
    }
    public String say(){
        return "Я животное";
    }
}

class Canidae extends Animal{ // здесь происходит наследование от Animal
    protected boolean isPredator; //добавляется новое поле хищник

    public Canidae(){ //добавляем конструктор
        isPredator = true;
    }

    public String growl() { // добавляет новый метод
        return "Ррр!";
    }
}

class Fox extends Canidae{ //наследование от candie и animal
    protected String color; // добавляется новое поле
}
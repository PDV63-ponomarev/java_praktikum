package Modifier1;

/*
Модификаторы вне группы "доступа" называются другими модификаторами
Переменная с модификатором static называется статичной,
привязывается к самому классу и существует независимо от экземпляров

- Внутри класса существует только одна копия статичной переменной
- На её значение ссылаются все экземпляры класса
- Если изменить значение статичной переменной, оно изменится у всех объектов класса

переменную статичной надо делать если:
- её значение не зависит от обьектов
- её значение будет совместно использоватьсявсеми обьектами одного класса


методы с модификатором static
чаше всего модификатор используется для "полезных" задач, отвечаюшие за действия не меняюшие состояние обьекта

@Override и static несовместимы
переопределять статические методы нельзя

объект наследника можно сохранить в переменной родительского типа.
Выполняться будет метод того класса, который соответствует типу переменной
Если объект-наследник сохранен в переменную родительского типа,
то при выполнении будет вызван род метод, а не класс-наследник

Внутри static метода нельзя использовать ключ слова this и super


*/

public class Static1 {
    public static void main(String[] args) {

        Bird tweety = new Bird();
        Bird pepper = new Bird();
        Bird floosie = new Bird();


        Wolf dog = new Dog();
        dog.behaviorIfMeetHuman();

    }
}

class Bird{
    public static int numberOfWings = 2;
    // у всех экземпляров этого класса будет по 2 крыла.
    // Если изменить значение, то изменится у всех экземпляров

    private static int count = 0;
    Bird(){
        count ++;
        System.out.println("Кол-во созданных объектов: " + count);
    }
}

class Counter{
    private int notStaticVariable = 0;
    private static int staticVariable = 0;

    public void addTen(){
        notStaticVariable += 10;
        staticVariable +=10;
    }
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.addTen();

        Counter counter2 = new Counter();
        // у counter2 значения будут 0 и 10.
        // поскольку staticVariable был изменен в addTen
        // notStaticVariable не static, потому переприсвоилось 0 в новом экземпляре
    }
}

class Wolf {
    public static void behaviorIfMeetHuman(){
        System.out.println("Рычать");
    }
}

class Dog extends Wolf{
    public static void behaviorIfMeetHuman(){
        System.out.println("Гавкать");
    }
}
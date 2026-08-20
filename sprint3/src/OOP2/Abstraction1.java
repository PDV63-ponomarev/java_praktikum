package OOP2;

/*
Абстракия как принцип ООП - сокрытие деталей реализации.
Есть информация что делает обьект, но не как делает

Абстрактный класс - это базовый класс, у которого не может быть экземпляров.
На его основе создаются обычные классы, объединённые общими чертвами

В абстрактном классе вместо реализации классов, находится только их описание.
Реализация методов находится в классах-наследниках

методы в абстрактных классах бывают:
-обычные, реализация которая будет общей для всех наследников
-асбтрактные, указываются без реализации, поскольку у каждого наследника будет своя

*/
public class Abstraction1 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Лягушка");
        frog.move();

        Toad toad = new Toad();
        System.out.println("Жабка");
        toad.move();
    }
}

abstract class Amphibian {
    // обычный метод с реализацией
    public void eat(){
        System.out.println("Питаюсь насекомыми");
    }

    // абстрактный метод без реализации
    public abstract void move();

    protected String color;
    protected Amphibian(String color){
        this.color = color;
    }

    abstract String getColor();
}

class Frog extends Amphibian{
    protected Frog() {
        super("Зеленая");
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public void move(){
        System.out.println("Передвигаюсь прыжками");
    }
}

class Toad extends Amphibian{
    protected Toad() {
        super("Коричневая");
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public void move(){
        System.out.println("Передвигаюсь хождением");
    }
}
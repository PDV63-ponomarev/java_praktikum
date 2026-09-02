package praktiks.OOP.abstraction1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog();
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster();
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish();
        fish.sleep();

        Spider spider = new Spider();
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }

}

abstract class Pet{
    public void sleep(){
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }

    public void giveVoice(){}

    public int pawsCount;
    protected Pet(int pawsCount){
        this.pawsCount = pawsCount;
    }

    abstract int getPawsCount();
}

class Cat extends Pet {
    protected Cat() {
        super(4);
    }

    public void catchMouse(){
        System.out.println("Поймала мышку!");
    }

    @Override
    public void giveVoice() {
        System.out.println("Мяу!");
    }

    @Override
    int getPawsCount() {
        return pawsCount;
    }
}

class Hamster extends Pet{
    protected Hamster() {
        super(4);
    }

    public void hideFood(){
        System.out.println("Вся еда - в щечках! ");
    }

    @Override
    int getPawsCount() {
        return pawsCount;
    }
}

class Dog extends Pet{
    protected Dog() {
        super(4);
    }

    public void bringStick(){
        System.out.println("Принёс палочку, как хороший мальчик!");}

    @Override
    int getPawsCount() {
        return pawsCount;
    }
}

class Fish extends Pet{
    protected Fish() {
        super(0);
    }

    @Override
    public void sleep() {
        System.out.println("Рыбки не спят!");
    }

    @Override
    int getPawsCount() {
        return pawsCount;
    }
}

class Spider extends Pet{
    public Spider() {
        super(8);
    }

    @Override
    int getPawsCount() {
        return pawsCount;
    }
}

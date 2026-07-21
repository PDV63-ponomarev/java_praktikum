public class Spr1_3 {
    public static void main(String[] args) {
        /*
        Hamster homa = new Hamster();
        System.out.println("Имя хомяка: " + homa.name);
        System.out.println("Возрост хомяка: " + homa.age);
        System.out.println("Вес хомяка: " + homa.weight);
        System.out.println("Пушистый ли хомяк: " + homa.isFluffy);
        System.out.println("Цвет хомяка: " + homa.color);
        System.out.println("Пол хомяка: " + homa.manOrWoman);
        */

        Hamster homa = new Hamster("Хома", 2, 10);
        System.out.println("Цвет хомяка: " + homa.color);
    }
}
class Hamster {
    /*
    String name = "Хома";
    int age = 2;
    double weight = 323.4;
    boolean isFluffy = true;
    String color = "Рыжий";
    String manOrWoman;
    */

    String name;
    int age;
    double weight;
    String color;

    Hamster(String hamsterName, int hamsterAge, int hamsterWeight){
        name = hamsterName;
        age = hamsterAge;
        weight = hamsterWeight;
        //отсутствует строка с инициализацией color
    }


}
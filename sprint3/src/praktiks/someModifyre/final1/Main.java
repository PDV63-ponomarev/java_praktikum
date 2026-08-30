package praktiks.someModifyre.final1;

import java.util.List;

public class Main {
    private Forest forest;

    public static void main(String[] args) {
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );

        System.out.println("В лесу лето!");
        Forest forest = new Forest(hares, "Лето");

        System.out.println("Список зайцев:");
        forest.printHares();

        System.out.println("В лесу зима!");
        forest.setSeason("Зима");
        forest.printHares();
    }
}

package praktiks.someModifyre.final1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );

        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"

        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        System.out.println("В лесу зима!");
        // поменяйте время года на зиму
        // напечатайте список всех зайцев
    }
}

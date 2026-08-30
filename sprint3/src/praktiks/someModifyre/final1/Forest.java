package praktiks.someModifyre.final1;

import java.util.List;

// объявите недостающие переменные и добавьте конструктор

// добавьте метод setSeason(String newSeason)
// в этом методе реализуйте логику смены цвета шубок зайцев-беляков

// добавьте метод printHares()



public class Forest{
    private List<MountainHare> hares;
    private String season;

    // Конструктор
    public Forest(List<MountainHare> hares, String season) {
        this.hares = hares;
        this.season = season;
        setSeason(season); // Устанавливаем цвет при создании
    }

    // Метод для установки сезона и изменения цвета шкуры зайцев
    public void setSeason(String newSeason) {
        this.season = newSeason;

        if (newSeason.equals("Зима")){
            MountainHare.color = "белый";
        } else {
            MountainHare.color = "серо-рыжий";
        }
    }

    public void printHares(){
        if (hares == null || hares.isEmpty()) {
            System.out.println("В лесу нет зайцев");
            return;
        }

        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
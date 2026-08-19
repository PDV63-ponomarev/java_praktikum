package Modifier1;

/*
enum - Перечисление, перечисляемый тип
нужен для хранения множества значений

Все элементы перечесиления принято писать в верхнем регистре с нижним подчеркиванием
 все элементы - константы, каждая из которых static final

Можно создавать переменные  с типом объявленного перечисления.
В такой переменной можно хранить что либо
такой переменной можно присвоить только то значение, что которое определено в перечислении

 */


import java.util.ArrayList;
import java.util.List;

public class Enum4 {
    public enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    String title;
    TraficLight light = TraficLight.GREEN;

    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("Зеленая миля", FilmGenre.DRAMA));
        films.add(new Film("Побег", FilmGenre.DRAMA));
        films.add(new Film("Властелин кольца", FilmGenre.FANTASY));
        films.add(new Film("Король Лев", FilmGenre.FAMILY));

        filterByGenre(films, FilmGenre.DRAMA);
    }

    public static void filterByGenre(List<Film> films, FilmGenre genre){
        for(Film film : films){
            //сравнение жарна фильма из списка с используемым жанром
            if (film.getGenre()== genre) {
                System.out.println(film.getTitle());
            }
        }
    }

}

enum TraficLight{
    RED, YELLOW, GREEN
}

class Film{
    private String title;
    private FilmGenre genre;

    public Film(String title, FilmGenre genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public FilmGenre getGenre() {
        return genre;
    }
}

enum FilmGenre {
    FAMILY,
    COMEDY,
    DOCUMENTARY,
    DRAMA,
    HORROR,
    FANTASY,
    THRILLER
}
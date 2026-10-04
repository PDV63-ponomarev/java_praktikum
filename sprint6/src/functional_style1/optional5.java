package functional_style1;

/*
Самая частая ошибка исполнения в Java - NullPointerException.
Возникает, когда программа обращается к null как к объекту.
Способы ее поймать и обработать до исполнения - на этапе компиляции.

Класс Optional был разработал специально для проверки ошибок на NullPointerException.
 Стоит использовать в тех случаях, когда предпологается получить Null. Чаще всего это
 возвращаемые значения методов.

Optional для примитивов
В случае если метод возвращает примитивное значение и нужно допустить его отсутствие,
есть несколько стандантрых классов типа Optionsl.
OptionalInt для int
OptoionalLong, OptionalDouble
Они нужны потому, что аргументов для тип-параметра джеерик-класса не может быть
примитивный тип. В остальном же вся работа с этими аналогами Optional такаяже.


 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class optional5 {
    public static void main(String[] args) {
        List<String> cosmicTourists = new ArrayList<>();

        findLuckyPerson().ifPresent(cosmicTourists::add);


        int[] ages = { 5, 13, 20, 5, 25, 19, 48, 11 };
        OptionalInt youngest = youngestAdult(ages);
        if (youngest.isPresent()) {
            System.out.println("Возраст самого младшего совершеннолетнего: " + youngest.getAsInt());
        } else {
            System.out.println("Совершеннолетних нет.");
        }
    }

    public static Optional<String> findLuckyPerson() {
        if (Math.random() <= 0.5) {
            return Optional.of("Александра");
        } else {
            return Optional.empty();
        }
    }

    public static OptionalInt youngestAdult(int[] ages) {
        int youngest = -1;
        for (int age : ages) {
            if (age >= 18) {
                if (youngest == -1 || age < youngest) {
                    youngest = age;
                }
            }
        }
        return youngest != -1 ? OptionalInt.of(youngest) : OptionalInt.empty();
    }
}

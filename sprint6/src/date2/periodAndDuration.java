package date2;

/*

Классы длительности промежутков между временем.

Класс Period (период, срок)
Используется для вычисления срока между двумя датами. В экземлпяре есть три поля:
    - продолжительность в годах - getYears()
    - месяцах - getMonths()
    - днях - getDays()

Самый простой способ узнать продолжительность - вызвать статический метод
between(LocalDate startDate, LocalDate endDate) который вычисляет пероди между датами.
День обозначенный датой endDate в расчете не учитывается.

    Period.between(LocalDate.of(2021, 11, 15), LocalDate.of(2021, 11, 19)
    промежуток 4 дня

Класс Duration
Хранит продолжительность времени с точностью до наносекунды и используется
для вычисления длительности времени между двумя моментами

Кроме того у Instant, LocalDateTime, LocalDate и LocalTime есть метод
plus(TemporalAmount amountToAdd), где TemporalAmount - интерфейс, отвечающий за
продолжительность времени, который реализует Duration(но не Period). Его можно использовать
и для вычисления момента времени, который произойдет спустя промежуток, храняшийся
в Duration.
Если в переменную храняющую промежуток (90 минут к примеру), то при добавлении его
к какому либо моменту времени, получится новый но на 90 минут позже.


Создание объектов Duration и Period
Создать объект с промежутком времени можно в ручную:
1) Перечислить все составляющие промежутка: Года, месяцы, дни для Period
    Period longTime = Period.of(100, 10, 1)
2) Воспользоваться методами по созданию промежутка из конкретной величины.
    Для Period:
    - ofDays(int days) -создает экземплять длительностью days дней
    - ofWeek(int weeks)
    - ofMonths(int months)
    - ofYears(int years)

Метод toString() у класса Period выводить продолжительность в формате РлетYмесяцеМднейD.
 Если какая-то составляющая равна нулю, то она упускается.
    Промежуток 3 года, 4 месяца и 5 дней = P3Y4M5D
    1 год, 10 дней = P1Y10D
    14 дней = P14D

Методы создания экзеемпляра Duration:
    - ofSeconds(long seconds) — создаёт экземпляр Duration длительностью seconds секунд,
    - ofSeconds(long seconds, long nanoAdjustment) — длительностью seconds секунд и nanoAdjustment наносекунд,
    - ofMinutes(long minutes) — длительностью minutes минут,
    - ofHours(long hours) — длительностью hours часов,
    - ofDays(long days) — длительностью days дней.

Метод toString выодит продолжительность в формате PчасыHминутыMсекундыS:
    7 часов, 10 минут, 5 секунд = P7H10M5S
    1 час, 30 секунд и 7 наносекунд = P1H30.00000007S


Методы класса Duration

Так как Duration предоставляет больше возможностей по использованию, промежутки времени
чаще всего вычисляют именно с помощью него.

У этого класса есть два поля, которые и отражают продолжительность:
количество секунд и дробная часть секунды — в наносекундах. Получить значения этих полей
можно с помощью методов getSeconds() и getNano().

Так как выводить время в секундах далеко не всегда удобно, то у Duration есть методы,
приводящие продолжительность в другие единицы времени:

    - toDays() — возвращает целое число дней в промежутке;
    - toHours() — целое число часов;
    - toMinutes() — целое число минут;
    - toMillis() — целое число миллисекунд;
    - toNanos() — целое число наносекунд;
    - toHoursPart() — возвращает количество часов от неполного дня;
    - toMinutesPart() — количество минут от неполного часа;
    - toSecondsPart() — количество секунд от неполной минуты;
    - toMillisPart() — количество миллисекунд от неполной секунды.

 */


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class periodAndDuration {

    public static void main(String[] args) {

        daysForBirthday();

    }

    static void daysForBirthday(){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1995, Month.SEPTEMBER, 1);

        Period age = Period.between(birthday, today);
        System.out.println("Ваш возраст:");
        System.out.println(age.getYears() + " лет");
        System.out.println(age.getMonths() + " месяцев");
        System.out.println(age.getDays() + " дней");
    }
}

package date2;

/*
Иногда требуется работать со временем как с часами и календарем - узнавать и учитывать
в программе текущее время и дату.
Это нужно для расчета словот доставки, запуске скриптов или вычисления дат.

класс LocalDateTime
Сохраняет текущую дату и время с помощью класса и метода now()
    LocalDateTime currentMoment = LocalDateTime.now();
Время программа берет из устройства на котором запущена. Если на устр установлено неправильное
время, то в экземпляр класса попадет с ошибкой.

Чтобы создал экземпляр класса LocalDateTime нужно воспользоваться методом of(...).
Аргументы идут в порядке уменьшения точности: год, месяц... секунды, наносекунды.
Секунды и наносекунды можно отбросить, а месяц удобнее задавать через констант
перечисления java.time.Month.
    LocalDateTime.of(2025, Month.FEBRUARY, 23, 12, 20);

Методы LocalDateTime
Аналогично классу Instant, у LocalDateTime есть методы для получения новых экземпляров
на основе уже имеющихя

    - plusYears(long years) / minusYears(long years) - создает экземпляр с прибавкой или
    вычитом указанных лет
    - plusMonths(long months) / minusMonths(long months) - создает экземпляр с прибавылением
    или вычитанием месяцев
    - plusWeeks(long weeks) / minusWeeks(long weeks) - кол-во недель
    - plusDays(lond days) / minusDays(long days) - кол-во дней
    - plusHours(long hours) / minusHours(long hours)
    - plusMinutes(long minutes) / minusMinutes(long minutes)
    - plusSeconds(long seconds) / minusSeconds(long seconds)
    - plusNanos(long nanos) / minusNanos(long nanos)

Сравнение:
    -isBefore(LocalDateTime otherMoment) - true если экземпляр был раньше чем otherMoment
    -isAfter(LocalDateTime otherMoment) - true если экземпляр был позже чем otherMoment
    -equals(LocalDateTime otherMoment) - true если обе даты совпадают

****
Класс DataTimeFormatter нужен для изменения текста отображения даты.
Метод ofPattern(String pattern) со спец символами нужен для форматы даты:
    - dd — день,
    - MM — месяц,
    - yyyy — год,
    - HH — час,
    - mm — минуты,
    - ss — секунды,
    - SSS — дробная часть секунд.

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm");
    String formateDate = now.format(formatter).

Метод parse(..) действует аналогично, но в обратном порядке. Если передать
только строку, то конвертация произойдет в формате ISO8601. Если в доволнение
к строке передать DateTimeFormatter, то конвертация будет выполнена из указаного патерна.

LocalDate
действует аналогично с LocalDateTime, но оперирует годами, месяцем и днем

LocalTime
Оперирует часами, минутами, секундами и наносекундами

Для создание экземпляра, можно использовать метод of(..)
    LocalTime someTime = LocalTime.of(12, 15, 35, 344)
    LocalDate someDate = LocalDate.of(2000, JANUARY, 1)

В LocalDate можно создать экзепляр с помощью ofYearDate(int year, int day).
Будет хранить порядковый номер дня в году

Из LocalDateTime, LocalDate и LocalTime можно извлечь нужные единицы времени
с помощью методов:
    - getYear() — возвращает год,
    - getMonth() — константу месяца,
    - getMonthValue() — номер месяца,
    - getDayOfMonth() — день месяца,
    - getHour() — часы,
    - getMinute() — минуты,
    - getSecond() — секунды,
    - getNano() — наносекунды.

Кроме этого, у LocalDateTime и LocalDate есть ещё два метода:
    - getDayOfYear() — возвращает порядковый номер дня в году,
    - getDayOfWeek() — возвращает день недели — константу java.time.DayOfWeek.





 */


import java.time.LocalDateTime;
import java.time.Month;

public class localDateTime2 {
    public static void main(String[] args) {
        LocalDateTime currentMoment = LocalDateTime.now();
        System.out.println(currentMoment);

        LocalDateTime dateTime = LocalDateTime.of(2025, Month.FEBRUARY, 23, 12, 20);
        System.out.println(dateTime);
    }
}

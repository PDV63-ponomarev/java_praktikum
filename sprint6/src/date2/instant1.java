package date2;


/*

Unix время
В java время хранимтся в виде целого числа - количества миллисекунд.
Два основных стандарта измерения и записи времени:
    -GMT - время по Гринвичу. Особенность - неравномерное время, в какомто году секунды длинее,
    в другом короче.
    - UTC  Все секунды постоянные и отсчитываются с помощью атомных часов. В зависимости от
    местоположение и зимнего-летнего времени, к UTC добавляются или убавляется дополнительное время
    это называется смещение отностиельно UTC. Москва - UTC+3

Unix-время соответствует UTC без смещения, иногда обозначается как UTC0

Количество времени в миллесекундах от Unix-эпохи называется timestamp (метка времени)
Это универсальный и общепринятый способ описания момента во времени в виде целого числа.
Такое представление удобно и практично для передачи по сети или хранения в БД.

Удобство состоит в передаче единого числа.

****
Instant
Класс Instant хранит количество миллисекунд от Unix и кол-во наносекунд.

Instant представляет ряд статических методов
now() - получить текущую метку времени
    Instant currentTime = Instant.now();

toString() - дата и время будет выведены в формате ISO-8601:
год-месяц-день Т часы:миниты:секундя Z.
    2026-10-06T11:37:46.106290900Z
    2026.10.06  11:37

toEpochMilli()
Посчитать кол-во миллисекунд с Unix-эпох до конкретной метки времени

Методы ofEpochSecond(long epochSecond), ofEpochMilli(long epochMilli) и
ofEpochSecond(long epochSecond, long nanoAdjustment)
Зная количество секунд от момента события до Unix, можно создать экземпляр класса
Instant с помощью статического метода ofEpochSecond(long epochSecond).
Или ofEpochMilli(long epochMilli) - если известно кол-во миллисекунд.
Если нужен момент времени с точностью до наносекунд, можно использовать
метод ofEpochSecond(long epochSecond, long nanoAdjustment) : передает кол-во секунд и отдельно
кол-во наносекунд.
Чтобы получить время ДО Unix, нужно передать отрицательное число.

У Instant есть верхняя и ниэняя граница, содержашаяся в Instat.MAX и Instant.MIN

*****
Работа с экземплярами класса Instant
Экземпляры класса Instant - неизменяемые. У созданного экземпляра нельзя поменять время,
например перевести на час.  Есть специальные методы для создания нового экземпляра на основе старого

    - plusSecond(long secondToAdd) - создает экземпляр класса Instant, который
    будет отличаться от текущего на secontToAdd секунд в большую сторону
    - plusMillis(long millisToAdd) - на милисекунды в большую сторону
    - plusNanos(long nanos) - на наносекунды в большую сторону
    - minusSecond(long second) - на секунды в меньшую сторону
    - minusMillis(long millis) - на милисекунды в меньшую
    - minusNanos(long nanos) - на наносекунды в меньшую

Определить как два момента времени расположены относительно друг друга:
    - isAfter(Instance otherInstance) возвращает true, если время в экземпляре
    Instance, у которого вызывается метод, находится позже чем otherInstnce,
    в противоположеном случае - false
    - isBefore(Instance otherInstance) возвращает true, если экземпляр раньше чем
    otherInstance, false в противоположном
    - equals(Object otherInstance) - true если оба экземлпяра указывают на одно время





 */


import java.time.Instant;

public class instant1 {

    public static void main(String[] args) {
        Instant currentTime = Instant.now();
        System.out.println(currentTime.toString());

        long milliSeconds = currentTime.toEpochMilli();
        System.out.println(milliSeconds);

        // передаём количество секунд с запуска спутника до Unix-эпохи
        Instant satelliteLaunchFromSec = Instant.ofEpochSecond(-386310686L);
        // или делаем то же самое в миллисекундах
        Instant satelliteLaunchFromMillis = Instant.ofEpochMilli(-386310686000L);

        System.out.println(satelliteLaunchFromSec + " — время запуска, заданное через секунды.");
        System.out.println(satelliteLaunchFromMillis + " — время запуска, заданное через миллисекунды.");

        System.out.println(Instant.MAX);
        System.out.println(Instant.MIN);


        // просмотр сколько времени через 180 секунд (3 минуты)
        long seconds = 180;

        Instant currectMoment = Instant.now();
        System.out.println("Сейчас: " + currectMoment);
        Instant future = currectMoment.plusSeconds(seconds);
        System.out.println("Через " + seconds + " cекунд " + future);


    }

}

package date2;

/*

За мировое время отвечает класс ZonedDateTime (дата и время временной зоны)
Это тот же LocalDateTime, но с добавлением ZoneId.
Работать с ZoneId можно двумя способами: с фиксированным смещением относительно
UTC и с привязкой к конкретному региону.

Фиксированное смещение
Серверные системы, распределенные по миру удобнее всего установть одинаковое
смещение, например UTC0, чтобы не заивисть от перехода на зимнее-летнее время.
При этом расположение серверов не будет иметь значение, время на них будет одинаковое

Чтобы создать экземпляр ZoneId с фиксированным смещением, необходимо воспользоваться
методом of(String offset), передав ему смещение в формате UTC[+/-]hh:mm
    ZoneId zoneUtc = ZoneId.of("UTC-03:45");

Если смещение задано только в часах, его можно записать короче UTC[+/-]h
    ZoneId zoneUtc = ZoneId.of("UTC-03"); //аналогично UTC-03:00

Из LocalDateTime и ZoneId можно собрать ZonedDateTime.
    zoneDateTimeExample()
Особенность такого подхода:
    - Точная привязка к мировому времени: использование Unix-времени аналогично Instant,
    но с вобранным смещением
    - Отсутствие привязки к месту

Чтобы избежать проблем с историческим изменением часовых поясов конрктеного места
(зимнее-летнее время), в java есть второй вариант хранения времени

Временные зоны
Привязка ZoneId к региону позволяет учитывать переход с зимнего на летнее время и историю
изменения часовых поясов в разных странах. Например, программа будет знать, что в 2011
отменили зимнее и летнее время, а в 2014 изменили часовые пояса регионов.

Создать экземпляр ZoneId с привязкой к региону можно с помощью метода of(название региона)
    ZoneId zoneId = ZoneId.of("Europe/Moscow");

создать ZonedDataTime можно с помощью метода of(LocalDateTime localDateTime, ZoneId zone)
    localZoneDate();

Так как LocalDateTime - дата и время на каком-то устройстве, перевести его без экземпляра
ZoneId в ZonedDateTime не получится: не хватит информации для привызки к общемировому времени.

На конкретный момент времени указывает класс Instant. Получив от внешней системы временную метку,
можно перевести её в экземпляр ZoneDateTime с конкретной временной зоной - с помощью статического
метода ofInstan(Instant intstant, ZodeId zone)
    zoneDate();


Методы ZonedDateTime
Методы в ZonedDateTime такие же, как и в LocalDateTime. Например plusDays(long days) создает
новый экземпляр времени с прибавлением указанного количества дна, а isBefore(ZonedDateTime date)
вернет true, если экземпляр у которого вызывается метод, находится раньше чем date

Для создания экземпляра с изменением временной зоны есть два метода
withZoneSameInstant(ZoneId zone) - метод, аналогичный переводу часов: момент времени,
на который указывает экземпляр, остаётся неизменным, меняется LocalDateTime и ZoneId.

wothZoneSameLocal(ZoneId zone) - метод аналогичный выбору другого часового пояса в телефоне, часы
будут показывать тоже самое время, но зона будет другой. Например, электронная рассылка должна
прийти пользователям по всему миру в одно и тоже время, но по местному часовому поясу.
Для этого:
    1) нужно расчитать время и дату с часовым поясом, который установлен на сервере рассылки
    2) меняя часоые пояса, можно будет определить в какое именно время нужно отправлять письма
    адресатам из разных регионов

Форматирование для ZonedDateTime идентично LocalDateTime, с той лишь разницей,
что можно отобразить:
    - vv - название временной зоны
    - zzzzz - смещение в формате +03:00

 */



import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zoneDateTime {

    public static void main(String[] args) {
        zoneDateTimeExample();

        localZoneDate();

        zoneDate();
    }

    static void zoneDateTimeExample(){
        // Создаем экземпляр местного времени
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        //создаем экщемпляр временной зоны
        ZoneId zone = ZoneId.of("UTC+3");
        System.out.println(zone);

        //создаем экземпляр ZoneDataTime
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zone);
        System.out.println(zonedDateTime);
    }

    static void localZoneDate(){
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("Europe/Moscow");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        System.out.println(zonedDateTime);
    }

    static void zoneDate(){
        Instant moment = Instant.now();
        System.out.println("Сейчас: " + moment);

        //Сохраняет как самарское время:
        ZoneId zone = ZoneId.of("Europe/Samara");
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(moment, zone);

        System.out.println(zonedDateTime);
    }

}

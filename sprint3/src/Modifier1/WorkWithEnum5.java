package Modifier1;

/*
Перечисления помогают группировать логически связанные значения и повышают читаемость кода

 все методы класса Object - toString, getClass, hashCode и другие можно применять и к enum

метод equals() совпадает с оператором ==
если сравнивать объект с элементом перечсиления через equals
всегда должен вызываться у элемента пречисления, а не у объекта с которым мы сравниванием


метод values()
возвращает массив, содержащий все значения перечисления в том же порядке, в котором объявлялись


метод valueOf(String name)
находит и возврашает константу перечисления, которая совпадает со значением name
если элемент не надйен, вернет ошибку
Будет полезно, когда одному приложению нужно принять константу перечисления от другого приложения


метод name()
возвращает имя элемента перечисления
метод name() объявлен с модификатором final, его нельзя переопределить, но можно исп для получ ориг имени
метод toString() можно переопределить



если рядом с набором констант есть метод, то после последнего элемента нужен ;


перечисления и оператор switch
удобнее всего обработку перечислений делать с помощью switch

 */

public class WorkWithEnum5 {

    public static void main(String[] args) {
        printHoursForDay(DayOfWeek.FRIDAY);

        for (DayOfWeek day: DayOfWeek.values()){
            System.out.println(day);
        }

        System.out.println(DayOfWeek.valueOf("SUNDAY"));

        DayOfWeek friday = DayOfWeek.FRIDAY;
        System.out.println(friday);
        System.out.println(friday.name());
        System.out.println(friday.toString());

        for (VisaType type: VisaType.values()){
            System.out.println("Константа: " + type.name()
            +", имя для вывода: " + type.toString());
        }


        System.out.println(getDownliadLink(DeviceType.IOS));

    }

    public static String getDownliadLink(DeviceType type){
        String link = null;

        switch (type){
            case IOS:
                link = "IOSLINK";
                break;
            case WEB:
                link = "WEBLINK";
                break;
            case ANDROID:
                link = "ANDROIDLINK";
                break;
        }
        return link;
    }


    public static void printHoursForDay(DayOfWeek day){
        if (DayOfWeek.TUESDAY.equals(day) || DayOfWeek.THURSDAY.equals(day)
        || DayOfWeek.SUNDAY.equals(day)){
            System.out.println("В этот день музей работает с 11:00 до 19:00");
        } else if (DayOfWeek.WEDNESDAY.equals(day) || DayOfWeek.FRIDAY.equals(day)
        || DayOfWeek.SATURDAY.equals(day)){
            System.out.println("В этот день музей работает с 10:00 до 20:00");
        } else {
            System.out.println("Понедельник выходной");
        }
    }

    public static String getPopulationPercent(Continent continent){
        String result;
        switch (continent){
            case ASIA:
                result = "59.5%";
                break;
            case NORTH_AMERICA:
                result = "16.9%";
                break;
            case SOUTH_AMERICA:
                result = "7.7%";
                break;
            case ANTARCTICA:
                result = "<0.1%";
                break;
            case EUROPE:
                result = "9.7%";
                break;
            case AUSTRALIA:
                result = "0.5%";
                break;
            default:
                result = "Такого материка нет";
                break;
        }
        return result;
    }
}

enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}


enum VisaType{
    CLASSIC,
    GOLD,
    PLATINUM,
    SIGNATURE,
    INFINITE;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}

enum DeviceType{
    ANDROID,
    IOS,
    WEB
}

/////////////////////////////////




enum Continent{
    ASIA,
    AFRICA,
    NORTH_AMERICA,
    SOUTH_AMERICA,
    ANTARCTICA,
    EUROPE,
    AUSTRALIA
}
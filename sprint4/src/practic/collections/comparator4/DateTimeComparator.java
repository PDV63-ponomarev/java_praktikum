package practic.collections.comparator4;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {
    @Override
    public int compare(DateTime o1, DateTime o2) {
        // 1. Сравниваем годы
        int yearCompare = Integer.compare(o1.getYear(), o2.getYear());
        if (yearCompare != 0) {
            return yearCompare;
        }

        // 2. Если годы равны, сравниваем месяцы

        int monthCompare = Integer.compare(o1.getMonth(), o2.getMonth());
        if (monthCompare != 0) {
            return monthCompare;
        }

        // 3. Если месяцы равны, сравниваем дни
        int dayCompare = Integer.compare(o1.getDay(), o2.getDay());
        if (dayCompare != 0) {
            return dayCompare;
        }

        // 4. Если дни равны, сравниваем часы
        int hoursCompare = Integer.compare(o1.getHours(), o2.getHours());
        if (hoursCompare != 0) {
            return hoursCompare;
        }

        // 5. Если часы равны, сравниваем минуты
        int minutesCompare = Integer.compare(o1.getMinutes(), o2.getMinutes());
        if (minutesCompare != 0) {
            return minutesCompare;
        }

        // 6. Если минуты равны, сравниваем секунды
        return Integer.compare(o1.getSeconds(), o2.getSeconds());
    }
}

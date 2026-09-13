package practic.collections.comparator4;

public class DateTime {
    private final int year;
    private final int month;
    private final int day;
    private final int hours;
    private final int minutes;
    private final int seconds;

    public DateTime(int year, int month, int day, int hours, int minutes, int seconds) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }
    public int getSeconds() { return seconds; }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%d %02d:%02d:%02d", day, month, year, hours, minutes, seconds);
    }
}


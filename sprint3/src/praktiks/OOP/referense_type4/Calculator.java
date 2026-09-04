package praktiks.OOP.referense_type4;

import java.util.List;

public class Calculator {
    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        double day = 0;

        for (MediaItem media: mediaItems)
            if (media instanceof Series){
                day += media.getRuntime() * ((Series) media).getSeriesCount();
            } else {
                day += media.getRuntime();
            }
        day = day / (60 * 24);
        day = Math.floor(day * 10) / 10;
        return day;
    }
}

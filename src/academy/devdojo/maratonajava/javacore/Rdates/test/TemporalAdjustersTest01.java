package academy.devdojo.maratonajava.javacore.Rdates.test;


import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.*;

class getNextWorkingDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;

        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        getNextWorkingDay adjust = new getNextWorkingDay();
        LocalDateTime now = LocalDateTime.now();
        Temporal temp = adjust.adjustInto(now);

        System.out.println(temp);
    }
}

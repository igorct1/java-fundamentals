package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime anniversary = LocalDateTime.of(1995, Month.MAY, 24, 6, 12, 10);
        System.out.println(ChronoUnit.DAYS.between(anniversary, LocalDateTime.now())); // 10630D;
        System.out.println(ChronoUnit.MONTHS.between(anniversary, LocalDateTime.now())); // 349M;
        System.out.println(ChronoUnit.YEARS.between(anniversary, LocalDateTime.now())); // 29Y;

    }
}

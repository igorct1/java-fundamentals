package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // 2024-06-30T11:47:10.229565550

        LocalDate date = LocalDate.of(2024, Month.DECEMBER, 6);
        LocalTime time = LocalTime.of(9, 25, 6);
        LocalDateTime localDateTime01 = date.atTime(time);


        System.out.println(localDateTime01);
    }
}

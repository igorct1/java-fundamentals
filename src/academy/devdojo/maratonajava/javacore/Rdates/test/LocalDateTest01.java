package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 5, 24);

        System.out.println(localDate);
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.lengthOfMonth());
    }
}

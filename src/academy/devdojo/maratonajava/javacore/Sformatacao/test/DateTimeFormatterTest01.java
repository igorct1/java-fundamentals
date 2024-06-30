package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String s1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = localDate.format(DateTimeFormatter.ISO_DATE);
        String s3 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20240530", DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println(parse1); // 2024-05-30

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse2 = LocalDateTime.parse("2024-06-30T18:37:19.58889485");
        System.out.println(parse2);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyy");

        String brTime = now.format(formatterBR);
        System.out.println(brTime); // 30/06/2024

        DateTimeFormatter formatterJPN = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.JAPAN);
        String jpnTime = now.format(formatterJPN);

        System.out.println(jpnTime); // 30.6月.2024

    }
}

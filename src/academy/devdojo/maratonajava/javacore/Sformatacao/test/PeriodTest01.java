package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate l1 = LocalDate.now();
        LocalDate l2 = LocalDate.now().plusDays(15);
        Period p1 = Period.between(l1, l2);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(30);
        Period p4 = Period.ofYears(3);
        System.out.println(p1); // P15D;
        System.out.println(p2); // P10D;
        System.out.println(p3); // P210D;
        System.out.println(p4); // P3Y;

        String daysInMonth = getMonth(28);
        System.out.println(daysInMonth);
    }

    public static String getMonth(int days) {
        int months = days / 30;
        int difference = days % 30;

        return months + "M" + difference + "D";
    }
}

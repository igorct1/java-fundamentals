package academy.devdojo.maratonajava.javacore.Rdates.test;
import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(LocalTime.MIN);
    }
}

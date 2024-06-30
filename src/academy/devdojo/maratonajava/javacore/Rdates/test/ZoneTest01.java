package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyo);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(tokyo);

        System.out.println(zonedDateTime);
        Instant instantNow = Instant.now();
        System.out.println(instantNow);
        ZonedDateTime zonedDateTimeInstant = instantNow.atZone(tokyo);
        System.out.println(zonedDateTimeInstant);
    }
}

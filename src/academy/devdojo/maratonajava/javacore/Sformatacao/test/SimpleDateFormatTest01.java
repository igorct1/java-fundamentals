package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat date = new SimpleDateFormat(pattern);
        System.out.println(date.format(new Date()));

    }
}

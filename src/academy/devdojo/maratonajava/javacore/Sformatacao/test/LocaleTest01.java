package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeItaly = new Locale("it", "it");
        DateFormat brDate = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat italyDate = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        System.out.println(brDate.format(c.getTime()));
        System.out.println(italyDate.format(c.getTime()));
    }
}

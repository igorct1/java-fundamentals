package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeJP);
        numberFormats[3] = NumberFormat.getInstance(localeBR);
        numberFormats[2] = NumberFormat.getInstance(localeItaly);

        double value = 10_100.2130;

        for (NumberFormat numberFormat : numberFormats){
            System.out.println(numberFormat.format(value));
        }
    }
}

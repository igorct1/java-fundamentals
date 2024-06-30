package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeItaly);

        double value = 1_000;

        for (NumberFormat numberFormat : numberFormats){
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }
    }
}

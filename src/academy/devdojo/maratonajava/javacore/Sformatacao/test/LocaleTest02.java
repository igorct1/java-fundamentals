package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        String[] isoCountries = Locale.getISOCountries();
        System.out.println(Locale.getDefault());

        for (String isoCountry : isoCountries){
            System.out.println(isoCountry);
        }

    }
}

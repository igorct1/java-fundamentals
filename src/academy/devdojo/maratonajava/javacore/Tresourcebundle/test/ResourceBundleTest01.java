package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        String hello = bundle.getString("hello");
        System.out.println(hello);

        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        String helloBR = bundle.getString("hello");
        System.out.println(helloBR);
    }
}

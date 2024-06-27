package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {

    public static void main(String[] args) {
        long in = System.currentTimeMillis();
        concatString(30_000);
        long fi = System.currentTimeMillis();
        System.out.println("tempo string: " + (fi - in) + "ms");

        long in2 = System.currentTimeMillis();
        concatStringBuilder(100_000);
        long fi2 = System.currentTimeMillis();
        System.out.println("tempo stringbuilder: " + (fi2 - in2) + "ms");
    }

    public static void concatString(int size) {
        java.lang.String text = "";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    public static void concatStringBuilder(int size) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }
}

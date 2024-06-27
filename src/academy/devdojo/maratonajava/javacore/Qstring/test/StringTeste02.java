package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTeste02 {
    public static void main(String[] args) {
        String name = "Kafka Hibino";

        System.out.println(name.charAt(0)); // K
        System.out.println(name.length()); // 12
        System.out.println(name.replace("Ka", "Je")); // Jefka
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(0, 3)); // Kaf

    }
}

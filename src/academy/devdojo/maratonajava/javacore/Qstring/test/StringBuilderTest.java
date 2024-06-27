package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String name = "Igor C.";

        name.concat(" Tozetti");
        StringBuilder sb = new StringBuilder("Igor");
        sb.append("coutinho ");
        sb.append("tozetti");
        System.out.println(name);
        sb.delete(0, 4);
        System.out.println(sb);
    }
}

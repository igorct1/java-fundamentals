package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        // strings no java são imutáveis.
        String name = "Igor"; // string constant pool
        String name2 = "Igor";
        String fullName = name.concat(" Tozetti");
        System.out.println(fullName);
        System.out.println(name == name2);

        String name3 = new String("Igor");
    }
}

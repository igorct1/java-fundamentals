package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest {
    public static void main(String[] args) {
        recursivididade();
    }

    public static void recursivididade(){
        recursivididade();
    }
}

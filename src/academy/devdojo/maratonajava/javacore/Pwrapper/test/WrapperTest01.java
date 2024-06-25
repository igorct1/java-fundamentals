package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        int intP = 1;
        short shortP = 1;
        byte byteP = 1;
        long longP = 10;
        double doubleP = 10;
        float floatP = 10;
        char charP = 'A';
        boolean booleanP = true;

        Integer intW = 1; // autoboxing
        Short shortW = 1;
        Byte byteW = 1;
        Long longW = 10L;
        Double doubleW = 10D;
        Float floatW = 10F;
        Character charW = 'A';
        Boolean boolW = true;

        int i = intW; // unboxing

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isUpperCase('A'));
    }
}

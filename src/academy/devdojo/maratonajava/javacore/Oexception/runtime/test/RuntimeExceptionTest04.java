package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndex");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOut");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro de IllegalArgument");
        } catch (ArithmeticException e) {
            System.out.println("Dentro de ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException");
        }

        try {
            maybeItThrowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void maybeItThrowException() throws SQLException, FileNotFoundException {
    }
}



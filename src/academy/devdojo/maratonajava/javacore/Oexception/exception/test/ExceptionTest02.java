package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        createFile();
    }

    private static void createFile() throws IOException {
        File file = new File("file/test.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

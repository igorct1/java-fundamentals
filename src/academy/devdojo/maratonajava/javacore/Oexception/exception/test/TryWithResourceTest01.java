package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.model.Reader01;
import academy.devdojo.maratonajava.javacore.Oexception.model.Reader02;

import java.io.*;

public class TryWithResourceTest01 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try (Reader01 reader01 = new Reader01();
             Reader02 reader02 = new Reader02()) {

        } catch (IOException e) {
        }
    }

    public static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

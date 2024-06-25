package academy.devdojo.maratonajava.javacore.Oexception.model;

import java.io.Closeable;
import java.io.IOException;

public class Reader02 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 2");
    }
}

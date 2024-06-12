package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.model.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.model.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader db = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        db.load();
        fileLoader.load();
    }
}

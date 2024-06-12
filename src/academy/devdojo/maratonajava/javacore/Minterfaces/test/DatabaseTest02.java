package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.model.DatabaseLoader;

public class DatabaseTest02 {
    public static void main(String[] args) {
        DatabaseLoader db = new DatabaseLoader();

        db.remove();

        db.checkPermission();
    }
}

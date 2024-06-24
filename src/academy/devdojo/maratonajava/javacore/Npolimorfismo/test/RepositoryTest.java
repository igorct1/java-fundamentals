package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.DatabaseRepository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.FileRepository;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository db = new DatabaseRepository();
        Repository file = new FileRepository();

        file.save();
        db.save();
        }
}

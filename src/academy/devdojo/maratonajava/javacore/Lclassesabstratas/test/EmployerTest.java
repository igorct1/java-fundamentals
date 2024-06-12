package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.model.Developer;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.model.Employer;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.model.Manager;

public class EmployerTest {
    public static void main(String[] args) {
        Developer dev = new Developer("Nami", 12500);
        Manager manager = new Manager("Zoro", 4000);

        System.out.println(dev);
        System.out.println(manager);
    }
}

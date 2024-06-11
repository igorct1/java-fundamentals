package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.model.Address;
import academy.devdojo.maratonajava.javacore.Hheranca.model.Employer;

public class InheritanceTest02 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("a");
        address.setZipcode("b");
        Employer employer = new Employer("Kakashi", "01", address, 20000);

    }
}

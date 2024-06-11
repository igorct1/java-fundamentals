package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.model.Address;
import academy.devdojo.maratonajava.javacore.Hheranca.model.Employer;
import academy.devdojo.maratonajava.javacore.Hheranca.model.Person;

public class InheritanceTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua da Morte");
        address.setZipcode("03363-032");

        double salary = 20000;
        Person person = new Person("Kaneki", "999-888-777-66", address);
        Employer employer = new Employer("Kafka", "Kaiju N.08", address, salary);

        System.out.println("----- Person -----");
        person.print();

        System.out.println("----- Employer -----");
        employer.print();
        employer.personReport();

    }
}

package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.model.Address;
import academy.devdojo.maratonajava.javacore.Hheranca.model.Employer;
import academy.devdojo.maratonajava.javacore.Hheranca.model.Person;

public class InheritanceTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua da Morte");
        address.setZipcode("03363-032");

        Person person = new Person();
        person.setName("Kaneki");
        person.setCpf("999-888-777-66");
        person.setAddress(address);

        Employer employer = new Employer();
        employer.setName("Kafka");
        employer.setCpf("Kaiju no.8");
        employer.setAddress(address);
        employer.setSalary(20000);

        employer.print();
    }
}

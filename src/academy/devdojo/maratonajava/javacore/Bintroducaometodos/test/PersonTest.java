package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Igor");
        person.print();

        System.out.println(person.getName());
    }
}

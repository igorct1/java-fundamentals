package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.model.Car;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.model.Owner;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setName("BMW");
        car2.setName("Ferrari");

        car1.owner.setName("Kafka Hibino");
        car2.owner.setName("Hoshina");

        System.out.println(car1.owner);
        System.out.println(car2.owner);
    }
}

package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.model.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("BMW");

        System.out.println(Car.SPEED_LIMIT);
    }
}

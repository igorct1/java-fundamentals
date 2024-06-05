package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "A4";
        car.model = "Audi";
        car.year = 2005;
        System.out.println(car.model);
    }
}

package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.model.Car;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("A4", "BMW", 270);
        Car c2 = new Car("Benz", "Mercedes", 290);
        Car c3 = new Car("Spider", "Ferrari", 300);

        Car.setSpeedLimit(230);
        System.out.println(Car.getSpeedLimit());

        c1.print();
        c2.print();
        c3.print();
    }
}

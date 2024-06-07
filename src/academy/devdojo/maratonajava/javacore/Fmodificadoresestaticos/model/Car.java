package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.model;

public class Car {
    private String name;
    private String model;
    private double speedMax;
    private static double speedLimit = 250;

    public void print(){
        System.out.println("--------");
        System.out.println("Name: "+this.name);
        System.out.println("Speed max: "+this.speedMax);
        System.out.println("Speed Limit: "+Car.speedLimit);
    }

    public Car(String name, String model, double speedMax) {
        this.name = name;
        this.model = model;
        this.speedMax = speedMax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(double speedMax) {
        this.speedMax = speedMax;
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }

    public static double getSpeedLimit(){
        return speedLimit;
    }
}

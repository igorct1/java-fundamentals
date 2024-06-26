package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.model;

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 250;
    public final Owner owner = new Owner();

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

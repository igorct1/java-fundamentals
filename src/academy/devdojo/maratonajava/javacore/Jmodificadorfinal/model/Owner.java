package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.model;

public class Owner {
    private String name;

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

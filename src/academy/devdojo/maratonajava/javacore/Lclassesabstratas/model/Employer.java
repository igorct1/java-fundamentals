package academy.devdojo.maratonajava.javacore.Lclassesabstratas.model;

public abstract class Employer {
    protected String name;
    protected double salary;

    public Employer(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    public abstract void calculateBonus();
}

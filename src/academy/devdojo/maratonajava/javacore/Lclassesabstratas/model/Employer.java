package academy.devdojo.maratonajava.javacore.Lclassesabstratas.model;

public abstract class Employer extends Person{
    protected String name;
    protected double salary;

    public Employer(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }

    public abstract void calculateBonus();
}

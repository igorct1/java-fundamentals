package academy.devdojo.maratonajava.javacore.Lclassesabstratas.model;

public class Developer extends Employer{

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + this.salary * 0.2;
    }
}

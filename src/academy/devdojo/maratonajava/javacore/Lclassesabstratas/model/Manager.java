package academy.devdojo.maratonajava.javacore.Lclassesabstratas.model;

public class Manager extends Employer{

    public Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + this.salary * 0.1;
    }
}

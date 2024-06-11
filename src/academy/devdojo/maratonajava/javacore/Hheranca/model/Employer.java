package academy.devdojo.maratonajava.javacore.Hheranca.model;

public class Employer extends Person {
    private double salary;

    @Override
    public void print(){
        super.print();
        System.out.println(this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

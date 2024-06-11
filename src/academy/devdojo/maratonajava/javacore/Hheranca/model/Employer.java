package academy.devdojo.maratonajava.javacore.Hheranca.model;

public class Employer extends Person {
    private double salary;

    public Employer(String name, String cpf, Address address, double salary) {
        super(name, cpf, address);
        this.salary = salary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.salary);
    }

    public void personReport() {
        System.out.println("Eu " + this.name + " recebi o salário de " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

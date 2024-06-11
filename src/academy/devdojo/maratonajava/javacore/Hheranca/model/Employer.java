package academy.devdojo.maratonajava.javacore.Hheranca.model;

public class Employer extends Person {
    private double salary;

    static {
        System.out.println("dentro do bloco e de funcionario");
    }

    {
        System.out.println("dentro do bloco n-e de funcionario");
    }

    {
        System.out.println("dentro do bloco n-e de funcionario 2");
    }

    public Employer(String name, String cpf, Address address, double salary) {
        super(name, cpf, address);
        this.salary = salary;
        System.out.println("dentro do construtor de funcionario");
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

package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double media;

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);

        if (salaries == null) {
            return;
        }

        for (double salary : salaries) {
            System.out.println("Salário: " + salary);
        }

        averageSalary();
    }

    public void averageSalary() {
        if (salaries == null) {
            return;
        }

        for (double salary : salaries) {
            media += salary;
        }

        media /= salaries.length;
        System.out.println("Média salarial: " + media);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public int getAge() {
        return age;
    }
}

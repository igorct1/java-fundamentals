package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

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

        double media = 0;

        for (double salary : salaries) {
            media += salary;
        }

        media /= salaries.length;
        System.out.println("Média salarial: " + media);
    }
}

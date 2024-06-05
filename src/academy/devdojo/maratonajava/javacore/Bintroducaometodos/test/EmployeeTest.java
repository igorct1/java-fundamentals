package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee igor = new Employee();
        double[] salaries = {1500, 2000, 1850};
        igor.name = "Igor";
        igor.age = 29;
//        igor.salaries = salaries;
//
        igor.printData();
        igor.averageSalary();
    }
}

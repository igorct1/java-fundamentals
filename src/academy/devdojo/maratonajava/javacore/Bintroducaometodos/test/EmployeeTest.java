package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee igor = new Employee();
        double[] salaries = {1500, 2000, 1850};
        igor.setName("Igor");
        igor.setAge(29);
        igor.setSalaries(salaries);

        igor.printData();
        igor.averageSalary();
        System.out.println(igor.getMedia());
    }
}

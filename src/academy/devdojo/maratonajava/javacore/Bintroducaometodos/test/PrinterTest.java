package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Printer;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Student;

public class PrinterTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Printer print = new Printer();

        student1.name = "Igor";
        student2.name = "Ippo";

        print.print(student1);
        print.print(student2);

    }
}

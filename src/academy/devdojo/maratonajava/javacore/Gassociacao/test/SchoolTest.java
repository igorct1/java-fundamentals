package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.School;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        School school1 = new School("Amélia de Araujo");
        Teacher teacher = new Teacher("Jiraya");
        Teacher teacher2 = new Teacher("Kakashi Sensei");
        School school2 = new School("Pedrão", teacher, teacher2);

        school1.setTeachers(teacher, teacher2);
        school1.print();
        school2.print();
    }
}

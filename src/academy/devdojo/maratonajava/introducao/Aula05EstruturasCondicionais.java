package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        double salary = 15000;
        double tax;


        if(salary <= 34712){
            tax = salary * 0.097;
            salary -= tax;
            System.out.println(tax);
            System.out.println("Você irá receber "+salary);
        }
    }
}

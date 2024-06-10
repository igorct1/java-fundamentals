package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class KeyboardScannerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome abaixo");
        String name = input.nextLine();
        System.out.println("Idade");
        int age = input.nextInt();


        System.out.println(name);
        System.out.println(age);
    }
}

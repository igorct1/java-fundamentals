package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.model.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest {
    public static void main(String[] args) {
        try {
            logg();
        } catch(InvalidLoginException e){
            e.printStackTrace();
        }
    }

    private static void logg() throws InvalidLoginException {
        Scanner sc = new Scanner(System.in);
        String username = "Goku";
        String password = "12341234";
        System.out.println("Digite o login");
        String usernamePassed = sc.nextLine();
        System.out.println("Digite a senha");
        String passwordPassed = sc.nextLine();

        if (!username.equals(usernamePassed) || !password.equals(passwordPassed)) {
            throw new InvalidLoginException("Usuario ou senha inválido!");
        }
    }
}

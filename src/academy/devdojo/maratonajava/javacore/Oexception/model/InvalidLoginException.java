package academy.devdojo.maratonajava.javacore.Oexception.model;

public class InvalidLoginException extends Exception {

    public InvalidLoginException() {
        super("Login inválido.");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}

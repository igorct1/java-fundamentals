package academy.devdojo.maratonajava.javacore.Kenum.model;

public class Client {
    private String name;
    private ClientType type;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public Client(String name, ClientType type) {
        this.name = name;
        this.type = type;
    }
}

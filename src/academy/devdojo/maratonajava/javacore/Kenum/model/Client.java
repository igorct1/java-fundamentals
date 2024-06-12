package academy.devdojo.maratonajava.javacore.Kenum.model;

public class Client {
    private String name;
    private ClientType type;
    private PaymentType paymentType;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                "clientType='" + type.CLIENT_VALUE + '\'' +
                ", type=" + type +
                ", paymentType=" + paymentType +
                '}';
    }

    public Client(String name, ClientType type, PaymentType paymentType) {
        this.name = name;
        this.type = type;
        this.paymentType = paymentType;
    }
}

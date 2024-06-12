package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.model.Client;
import academy.devdojo.maratonajava.javacore.Kenum.model.ClientType;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Igor", ClientType.PESSOA_FISICA);
        Client client2 = new Client("Gon", ClientType.PESSOA_JURIDICA);

        System.out.println(client);
        System.out.println(client2);
    }
}

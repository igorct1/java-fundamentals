package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.model.Client;
import academy.devdojo.maratonajava.javacore.Kenum.model.ClientType;
import academy.devdojo.maratonajava.javacore.Kenum.model.PaymentType;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Igor", ClientType.PESSOA_FISICA, PaymentType.CREDIT);
        Client client2 = new Client("Gon", ClientType.PESSOA_JURIDICA, PaymentType.DEBIT);

        System.out.println(client);
        System.out.println(client2);
        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));
    }
}

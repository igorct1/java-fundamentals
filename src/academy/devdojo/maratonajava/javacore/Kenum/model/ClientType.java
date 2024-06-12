package academy.devdojo.maratonajava.javacore.Kenum.model;

public enum ClientType {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int CLIENT_VALUE;

    ClientType(int clientValue) {
        this.CLIENT_VALUE = clientValue;

    }

    public int getCLIENT_VALUE() {
        return CLIENT_VALUE;
    }
}

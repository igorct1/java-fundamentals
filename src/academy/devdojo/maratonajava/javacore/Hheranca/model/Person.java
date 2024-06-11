package academy.devdojo.maratonajava.javacore.Hheranca.model;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;

    static{
        System.out.println("dentro do bloco e de pessoa");
    }

    {
        System.out.println("dentro do bloco n-e de pessao");
    }

    {
        System.out.println("dentro do bloco n-e de pessao 2");
    }

    public Person(String name, String cpf, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        System.out.println("dentro do construtor de pessoa");
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.address.getStreet());
        System.out.println(this.address.getZipcode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}



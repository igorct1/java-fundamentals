package academy.devdojo.maratonajava.javacore.Hheranca.model;

public class Person {
    private String name;
    private String cpf;
    private Address address;

    public void print(){
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



package academy.devdojo.maratonajava.javacore.Npolimorfismo.model;

public class Tomato extends Product {
    public static final double TAX_PER_CENT = 0.06;

    public Tomato(String name, double value) {
        super(name, value);
    }

    public double calculateTax() {
        System.out.println("Calculando imposto do Tomate");
        return this.value * TAX_PER_CENT;
    }
}

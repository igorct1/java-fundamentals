package academy.devdojo.maratonajava.javacore.Npolimorfismo.model;

public class Keyboard extends Product {
    public static final double TAX_PER_CENT = 0.21;

    public Keyboard(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto do Teclado");
        return this.value * TAX_PER_CENT;
    }

}

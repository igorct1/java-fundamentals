package academy.devdojo.maratonajava.javacore.Npolimorfismo.model;

public class Mouse extends Product{
    public static final double TAX_PER_CENT = 0.15;
    protected String brand;


    public Mouse(String name, double value) {
        super(name, value);

    }

    @Override
    public double calculateTax() {
        return this.value * TAX_PER_CENT;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

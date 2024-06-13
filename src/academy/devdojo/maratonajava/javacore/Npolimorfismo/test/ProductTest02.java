package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Keyboard;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Mouse;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Keyboard("Logitech K753", 100);
        Product product2 = new Mouse("G600", 450);

        Mouse mouse = new Mouse("Viper", 600);
        mouse.setBrand("Razer");

        TaxCalculator.productTaxCalculator(mouse);
        TaxCalculator.productTaxCalculator(product);
    }
}

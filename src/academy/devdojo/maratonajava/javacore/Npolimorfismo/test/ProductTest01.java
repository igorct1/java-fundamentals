package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Keyboard;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Mouse;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Tomato;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Logitech K836", 320);
        Tomato tomato = new Tomato("Tomatao devdojo", 10);
        Mouse mouse = new Mouse("G600", 600);
        TaxCalculator.productTaxCalculator(mouse);

    }
}

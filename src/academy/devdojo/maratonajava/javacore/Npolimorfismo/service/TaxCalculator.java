package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Mouse;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Product;

public class TaxCalculator {

    public static void productTaxCalculator(Product product){
        System.out.println("Relatório do produto: "+product.getName());
        double productTax = product.calculateTax();

        System.out.println("Produto: "+product.getName());
        System.out.println("Valor: "+product.getValue());
        System.out.println("Valor a ser pago: "+productTax);

        if(product instanceof Mouse){
            Mouse mouse = (Mouse) product;
            System.out.println("Marca do produto: "+mouse.getBrand());
        }
    }
}

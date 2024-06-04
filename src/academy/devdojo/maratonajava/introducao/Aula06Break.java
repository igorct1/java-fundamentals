package academy.devdojo.maratonajava.introducao;

public class Aula06Break {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condicao -> valorParcela = 1000;

        double carValue = 30000;

        for(int payment = 1; payment <= carValue; payment++){
            // primeira iteracao = 30000 / 2; -> 15000.0
            double paymentValue = carValue / payment;
            if (paymentValue < 1000) {
                break;
            }

            System.out.println(payment+" parcela"+ " no valor de: "+ paymentValue);

        }
    }
}

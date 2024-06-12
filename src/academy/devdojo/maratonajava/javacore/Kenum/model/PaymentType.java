package academy.devdojo.maratonajava.javacore.Kenum.model;

public enum PaymentType {
    CREDIT("Crédito") {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
    },
    DEBIT("Débito") {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.1;
        }
    };

    public final String paymentTypeValue;

    PaymentType(String paymentTypeValue) {
        this.paymentTypeValue = paymentTypeValue;
    }

    public abstract double calculateDiscount(double value);
}

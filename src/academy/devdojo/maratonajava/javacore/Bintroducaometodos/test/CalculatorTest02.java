package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int[] numbers = {1, 7, 12, 9};

        calc.sumArray(numbers);
        calc.sumVarArgs(1, 2, 10, 5);
    }
}
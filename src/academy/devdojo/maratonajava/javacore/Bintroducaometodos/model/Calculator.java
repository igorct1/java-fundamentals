package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class Calculator {

    public int sumTwoNumbers(int a, int b) {
        return a + b;
    }
    public void sumArray(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("normalArray: "+sum);
    }
    public void sumVarArgs(int... numbers){
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("varArgs: "+sum);
    }
}

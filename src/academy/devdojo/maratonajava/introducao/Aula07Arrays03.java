package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[1];
        int[][] arrayInt2 = {{1, 2}, {1, 2, 3}, {0}};

        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}

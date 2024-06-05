package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        int[][] days = new int[3][3];

        days[0][0] = 31;
        days[0][1] = 29;
        days[0][2] = 30;

        days[1][0] = 30;
        days[1][1] = 29;
        days[1][2] = 31;

        days[2][0] = 31;
        days[2][1] = 30;
        days[2][2] = 28;

        for(int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[0].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        for (int[] day : days){
            for (int num : day) {
                System.out.println("foreach: "+num);
            }
        }
    }
}

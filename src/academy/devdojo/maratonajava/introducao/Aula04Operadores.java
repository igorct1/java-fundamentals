package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // <> <= >= == !=
        // logics
        // && (AND) - || (OU) - ! (NOT)
        double totalValueAccountOne = 200;
        double totalValueAccountTwo = 10000;
        float playstationValue = 500;

        boolean isPlaystationBuyable = totalValueAccountOne >= playstationValue || totalValueAccountTwo >= playstationValue;

        System.out.println(isPlaystationBuyable); // true

        // = += -= /= %= *=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
    }
}

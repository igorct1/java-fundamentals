package academy.devdojo.maratonajava.introducao;


public class Aula07Arrays01 {
    public static void main(String[] args) {
       int[] ages = new int[3];
       ages[0] = 25;

       System.out.println(ages[0]);
       String[] names = new String[3];

       names[0] = "Igor";
       names[1] = "Maicon";
       names[2] = "Tozetti";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for(String name : names){
            System.out.println(name);
        }
    }
}

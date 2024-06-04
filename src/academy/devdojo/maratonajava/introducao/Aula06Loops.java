package academy.devdojo.maratonajava.introducao;

public class Aula06Loops {
    public static void main(String[] args) {
        // while, do-while, for

        for(int c = 0; c <= 10; c++){
            System.out.println(c);
        }
        int i = 0;
        while(i <= 10){
            i++;
            System.out.println(i);
        }

//        for(int p = 0; p <= 1000000; p++){
//            if(p % 2 == 0){
//                System.out.println(p);
//            } else {
//                System.out.println("impar");
//            }
//        }

        // break;
        int maxValue = 50;
        for(int t = 0; t <= maxValue; t++){
            System.out.println("Imprimiu: "+t);
            if(t == 25){
                break;
            }
            System.out.println("Imprimiu: "+t);
        }
    }
}

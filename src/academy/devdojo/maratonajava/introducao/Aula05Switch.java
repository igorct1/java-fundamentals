package academy.devdojo.maratonajava.introducao;

public class Aula05Switch {
    public static void main(String[] args) {
        byte day = 5;

        switch(day){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opcao invalida, forneca valores de 1 a 7");
        }
    }
}

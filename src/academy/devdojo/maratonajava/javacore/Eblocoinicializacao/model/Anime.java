package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.model;

public class Anime {
    private String name;
    private int[] episodes;

    // 1 -> Alocado espaco em memória pro objeto;
    // 2 -> Cada atributo de classe é criado e inicializado com valores default ou oq
    // for passado;
    // 3 -> Bloco de inializacao executado
    // 4 -> Construtores executados
    // 5 -> Métodos executados.

    /* bloco de inicializacao de instancia, sempre que instanciamos o objeto
     esse bloco é executado.
     */

    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
        System.out.println("Executado antes do construtor");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : this.episodes) {
            System.out.print(episode+" ");
        }
        System.out.println();
    }

    public void getName(){
        System.out.println(this.name);
    }
}

package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.model;


public class Anime {
    private String name;
    private static int[] episodes;

    // -> executado quando a JVM carrega a classe!
    static {
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
        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }
}

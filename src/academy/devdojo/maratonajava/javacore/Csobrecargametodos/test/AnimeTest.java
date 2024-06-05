package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.model.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();

        anime.init("Hajime no Ippo", "Boxe", 300);
        anime2.init("Naruto", "Shounen", 300, "Action");

        anime.print();
        anime2.print();
    }
}

package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.model.Manga;

public class MangaTest {
    public static void main(String[] args) {
        Manga manga = new Manga("The beginning of the end", 232, "Production IG");
        manga.print();
    }
}

package academy.devdojo.maratonajava.javacore.Dconstrutores.model;

public class Manga {
    private String name;
    private int chapters;
    private String studio;

    public Manga(String name, int chapters) {
        this();
        this.name = name;
        this.chapters = chapters;
    }

    public Manga(String name, int chapters, String studio){
        this(name, chapters);
        this.studio = studio;
    }

    public Manga() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.chapters);
        System.out.println(this.studio);
    }

}



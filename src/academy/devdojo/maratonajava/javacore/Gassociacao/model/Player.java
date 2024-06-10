package academy.devdojo.maratonajava.javacore.Gassociacao.model;

public class Player {
    private String name;
    private Team team;

    public void print() {
        System.out.println(this.name);

        if (team == null) return;

        System.out.println(team.getName());

    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}

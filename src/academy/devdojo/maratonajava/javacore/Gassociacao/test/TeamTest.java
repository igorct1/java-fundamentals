package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Team;

public class TeamTest {
    public static void main(String[] args) {
        Team team = new Team("Luminosity");
        Player player = new Player("FalleN");

        player.setTeam(team);
        player.print();
    }
}

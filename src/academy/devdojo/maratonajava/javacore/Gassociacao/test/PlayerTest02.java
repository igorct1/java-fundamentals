package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player01 = new Player("FalleN");
        Player player02 = new Player("Fer");
        Player player03 = new Player("Coldzera :)");

        Player[] players = {player01, player02, player03};

        Team team = new Team("SK Gaming");

        for (Player player : players) {
            player.setTeam(team);
        }

        team.setPlayers(players);
        System.out.println("--- jogador");
        player02.print();

        System.out.println("--- time");
        team.print();
    }
}

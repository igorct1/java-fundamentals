package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Player;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("cr7");
        Player player2 = new Player("ronaldinho gaucho");
        Player player3 = new Player("r9");

        Player[] players = new Player[]{player1, player2, player3};

        for(Player player : players){
            player.print();
        }
    }
}

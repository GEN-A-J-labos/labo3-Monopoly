/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 15.04.2020
 */

package ch.heigvd.gen;

import java.util.ArrayList;

public class MonopolyGame {
    private Board board;
    private Cup cup;
    private ArrayList<Player> players;
    private int roundCount;

    public MonopolyGame(int playerCount, int roundCount) {

        cup = new Cup(2);
        board = new Board();
        this.roundCount = roundCount;
        players = new ArrayList<>();

        for (int i = 0; i < playerCount; i++) {
            players.add(new Player("Player " + i, board, cup));
        }
    }

    public void playGame(){
        for(int round = 0; round < roundCount; round++){
            playRound();
        }
    }

    private void playRound(){
        for (Player player : players) {
            player.takeTurn();
        }
    }
}

/*
 *  GEN - Laboratoire 03 - Bonzon Ludovic, Bourqui Denis, Müller Nicolas
 *
 *  Modified on 03.04.2020
 */

package ch.heigvd.gen;

import java.util.ArrayList;

public class MonopolyGame {
    private Board board;
    private Dice[] dices;
    private ArrayList<Player> players;
    private int roundCount;

    public MonopolyGame(int playerCount, int roundCount) {
        dices = new Dice[]{new Dice(), new Dice()};
        board = new Board();
        this.roundCount = roundCount;
        players = new ArrayList();
        for (int i = 0; i < playerCount; i++) {
            players.add(new Player("Player " + i, board, dices));
        }
    }

    public void playGame(){
        for(int round = 0; round < roundCount; round++){
            playRound();
        }
    }

    private void playRound(){
        for(int playersTurn = 0; playersTurn < players.size() ; playersTurn++) {
            players.get(playersTurn).takeTurn();
        }
    }
}
